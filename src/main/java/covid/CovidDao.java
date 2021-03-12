package covid;

import javax.sql.DataSource;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.*;
import java.sql.*;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;


public class CovidDao {
    private DataSource dataSource;

    private final LocalTime START_TIME = LocalTime.of(8, 0);

    public CovidDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    Validators validators = new Validators();

    public void registerCitizen(Citizen citizen) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt =
                     conn.prepareStatement("insert into citizens(citizen_name,zip,age,email,taj,number_of_vaccination) values(?,?,?,?,?,?)")) {
            stmt.setString(1, citizen.getName());
            stmt.setString(2, citizen.getZipCode());
            stmt.setInt(3, citizen.getAge());
            stmt.setString(4, citizen.getEmail());
            stmt.setString(5, citizen.getTaj());
            stmt.setInt(6, 0);
            stmt.executeUpdate();

        } catch (SQLException sqle) {
            throw new IllegalStateException("Can't connect!", sqle);
        }
    }

    public void registerAllCitizens(BufferedReader reader) {
        try (reader) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                String name = parts[0];
                String zip = parts[1];
                int age = Integer.parseInt(parts[2]);
                String email = parts[3];
                String taj = parts[4];

                Citizen citizen = new Citizen(name, zip, age, email, taj);
                if (validators.checkAllDataInputs(citizen)) {
                    registerCitizen(citizen);
                } else {
                    throw new IllegalArgumentException("A következő adatok helytelenek:" + citizen);
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can't read file!", ioe);
        }
    }

    public String getCityByZipCode(String zipCode) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("select city from cities where zip = ?")) {
            stmt.setString(1, zipCode);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getString("city");
                }
            }
            throw new IllegalArgumentException("No such zipCode!");
        } catch (SQLException sqle) {
            throw new IllegalStateException("Can't connect!", sqle);
        }
    }

    public void fillCitiesTable(List<City> cities) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("insert into cities(zip,city) values(?,?)")) {
            for (City c : cities) {
                stmt.setString(1, c.getZipCode());
                stmt.setString(2, c.getName());
                stmt.executeUpdate();
            }
        } catch (SQLException sqle) {
            throw new IllegalStateException("Can't connect!", sqle);
        }
    }

    public void generateVaccinationList(String zip, String fileName) {
        List<Citizen> citizens = new ArrayList<>();
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM citizens where zip = ? ORDER BY `age` DESC  LIMIT 16")) {
            stmt.setString(1, zip);
            createResultSetAndCollectCitizens(fileName, citizens, stmt);
        } catch (SQLException sqle) {
            throw new IllegalStateException("Can't connect", sqle);
        }
    }

    private void createResultSetAndCollectCitizens(String fileName, List<Citizen> citizens, PreparedStatement stmt) throws SQLException {
        try (ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Citizen citizen = createCitizenFromResultSet(rs);
                citizens.add(citizen);
                Collections.sort(citizens, Comparator.comparing(Citizen::getName));
                writeListToFile(fileName, citizens);
            }
        }
    }


    private Citizen createCitizenFromResultSet(ResultSet rs) throws SQLException {
        String name = rs.getNString("citizen_name");
        String zipCode = rs.getString("zip");
        int age = rs.getInt("age");
        String email = rs.getString("email");
        String taj = rs.getString("taj");
        int numOfVacc = rs.getInt("number_of_vaccination");
        return new Citizen(zipCode, name, age, email, taj, numOfVacc);

    }

    private void writeListToFile(String fileName, List<Citizen> citizens) {
        try (BufferedWriter bw = Files.newBufferedWriter(Path.of("src/main/resources/" + fileName + ".txt"))) {

            bw.write("Időpont;Név;Irányítószám;Életkor;E-mail cím;TAJ szám");
            bw.newLine();
            LocalTime time = START_TIME;
            for (Citizen c : citizens) {
                LocalDate difference = LocalDate.now().minusDays(15);
                if (c.getNumberOfVaccination() == 0 || c.getLastVaccination().toLocalDate().isBefore(difference)) {
                    bw.write(time + ";");
                    bw.write(c.toString());
                    bw.newLine();
                }
                time = time.plusMinutes(30);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can't write file!", ioe);
        }
    }

    private long getIdByTaj(String taj) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("select citizen_id from citizens where taj = ?")) {
            stmt.setString(1, taj);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getLong("citizen_id");
                }
                throw new IllegalArgumentException("Nincs ilyen regisztráció");
            }
        } catch (SQLException sqle) {
            throw new IllegalStateException("Can't connect!");
        }
    }

    public void vaccinate(String taj, LocalDate date, VaccinType type) {
        long id = getIdByTaj(taj);
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("insert into vaccinations(citizen_id,vaccination_date,vaccination_status,note,vaccination_type) values (?,?,?,?,?)")) {
            stmt.setLong(1, id);
            stmt.setDate(2, Date.valueOf(date));
            stmt.setString(3, VaccinStatus.COMPLETED.toString());
            stmt.setString(4, null);
            stmt.setString(5, type.toString());
            stmt.executeUpdate();
        } catch (SQLException sqle) {
            throw new IllegalStateException("Can't connect!", sqle);
        }
    }

    public void updateVaccinationNumberAndDateByTaj(String taj, LocalDate date) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("update citizens set number_of_vaccination = ?,last_vaccination = ? where taj = ?")) {
            stmt.setInt(1, getVaccinationNumberByTaj(taj) + 1);
            stmt.setDate(2, Date.valueOf(date));
            stmt.setString(3, taj);
            stmt.executeUpdate();
        } catch (SQLException sqle) {
            throw new IllegalStateException("Can't connect!", sqle);
        }
    }

    public int getVaccinationNumberByTaj(String taj) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("select number_of_vaccination from citizens where taj = ?")) {
            stmt.setString(1, taj);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt("number_of_vaccination");
                }
                throw new IllegalArgumentException("Helytelen taj");
            }
        } catch (SQLException sqle) {
            throw new IllegalStateException("Can't connect!", sqle);
        }
    }

    public LocalDate getLastVaccinationByTaj(String taj) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("select last_vaccination from citizens where taj = ?")) {
            stmt.setString(1, taj);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    LocalDate standard = LocalDate.of(2000, 01, 01);
                    return rs.getDate("last_vaccination") != null ? rs.getDate("last_vaccination").toLocalDate() : standard;
                }
                throw new IllegalArgumentException("Nincs ilyen regisztráció");
            }
        } catch (SQLException sqle) {
            throw new IllegalStateException("Can't connect!", sqle);
        }
    }

    public VaccinType getVaccineTypeByTaj(String taj) {
        long id = getIdByTaj(taj);
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("select vaccination_type from vaccinations where citizen_id = ?")) {
            stmt.setLong(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return VaccinType.valueOf(rs.getString("vaccination_type"));
                }
                throw new IllegalArgumentException("Nincs ilyen regisztráció");
            }
        } catch (SQLException sqle) {
            throw new IllegalStateException("Can't connect!", sqle);
        }
    }

    public void rejectVaccination(String taj, LocalDate date, String note) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("insert into vaccinations(citizen_id,vaccination_date,vaccination_status,note) values (?,?,?,?)")) {
            stmt.setLong(1, getIdByTaj(taj));
            stmt.setDate(2, Date.valueOf(date));
            stmt.setString(3, VaccinStatus.REJECTED.toString());
            stmt.setString(4, note);
            stmt.executeUpdate();
        } catch (SQLException sqle) {
            throw new IllegalStateException("Can't connect", sqle);
        }
    }

    public long getCountOfCitizensByVaccinationNumber(long vaccinationNumber, String zip) {

        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("select count(*) AS num from citizens where number_of_vaccination = ? and zip = ?;")) {
            stmt.setLong(1, vaccinationNumber);
            stmt.setString(2, zip);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getLong("num");
                }
                throw new IllegalArgumentException("A megadott parameter helytelen!");
            }
        } catch (SQLException sqle) {
            throw new IllegalStateException("Can't connect", sqle);
        }
    }
}
