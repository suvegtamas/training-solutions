package covid;

import org.mariadb.jdbc.MariaDbDataSource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class CovidMain {
    public static void main(String[] args) {
        MariaDbDataSource dataSource = new MariaDbDataSource();
        try {
            dataSource.setUrl("jdbc:mariadb://localhost:3306/covid?useUnicode=true");
            dataSource.setUser("covid");
            dataSource.setPassword("covid");
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Can't connect!", sqlException);
        }
        Validators validators = new Validators();
        CovidDao covidDao = new CovidDao(dataSource);


        Scanner sc = new Scanner(System.in);
        System.out.println("Válasszon menüpontot:");
        System.out.println("1. Regisztráció\n" +
                "2. Tömeges regisztráció\n" +
                "3. Generálás\n" +
                "4. Oltás\n" +
                "5. Oltás meghiúsulás\n" +
                "6. Riport");
        int toExecute = sc.nextInt();
        sc.nextLine();

        switch (toExecute) {
            //Regisztracio-----------------------------------------------------------------------------------------------------------------------------
            case 1: {
                System.out.println("Név:");
                String name = sc.nextLine();
                if (validators.isNameEmpty(name)) {
                    throw new IllegalArgumentException("A név nem lehet üres!");
                }

                System.out.println("Írányítószám:");
                String zip = sc.nextLine();
                if (validators.isZipCodeEmpty(zip)) {
                    throw new IllegalArgumentException("Az írányítószám nem lehet üres!");
                }
                System.out.println(covidDao.getCityByZipCode(zip));

                System.out.println("Életkor:");
                String age = sc.nextLine();
                if (!validators.isAgeCorrect(Integer.parseInt(age))) {
                    throw new IllegalArgumentException("Az életkor helytelen(10-150)");
                }


                System.out.println("E-mail:");
                String email = sc.nextLine();
                if (!validators.validateEmailAddress(email)) {
                    throw new IllegalArgumentException("Az email helytelen");
                }

                System.out.println("E-mail újra:");
                String email2 = sc.nextLine();
                if (!email.equals(email2)) {
                    throw new IllegalArgumentException("Az email nem eggyezik");
                }

                System.out.println("TAJ:");
                String taj = sc.nextLine();
                if (!validators.validateTaj(taj)) {
                    throw new IllegalArgumentException("A TAJ szám invalid.");
                }

                Citizen citizen = new Citizen(zip, name, Integer.parseInt(age), email, taj);
                covidDao.registerCitizen(citizen);
                break;
            }
            //Tomeges regisztracio -------------------------------------------------------------------------------------------------------------------
            case 2: {
                System.out.println("Adja meg a file nevét kiterjesztéssel:");
                String file = sc.nextLine();
                try (BufferedReader br = new BufferedReader(new InputStreamReader(CovidMain.class.getResourceAsStream("/" + file)))) {
                    covidDao.registerAllCitizens(br);
                    System.out.println("A mentés sikeres volt!");
                } catch (IOException ioe) {
                    throw new IllegalStateException("A file nem létezik vagy a név helytelen!", ioe);
                }
                break;
            }
            //Generalas -----------------------------------------------------------------------------------------------------------------------------
            case 3: {
                System.out.println("Generáláshoz adjon meg egy irányítószámot:");
                String zip = sc.nextLine();
                if (validators.isZipCodeEmpty(zip)) {
                    throw new IllegalArgumentException("Nem adott meg irányítószámot");
                }


                System.out.println("Adja meg a filenevet:");
                String fileName = sc.nextLine();
                if (fileName.isBlank()) {
                    throw new IllegalArgumentException("Nem adot meg filenevet.");
                }


                covidDao.generateVaccinationList(zip, fileName);
                System.out.println("A generálás megtórtént, a file megtalálható a resources könyvtárban");
                break;
            }
            //Oltas -----------------------------------------------------------------------------------------------------------------------------
            case 4: {
                System.out.println("Adja meg a TAJ számot:");
                String taj = sc.nextLine();
                if (!validators.validateTaj(taj)) {
                    throw new IllegalArgumentException("Helytelen TAJ szám");
                }

                System.out.println("Adja meg a dátumot(pl:" + LocalDate.now() + "):");
                LocalDate date = LocalDate.parse(sc.nextLine());
                LocalDate difference = covidDao.getLastVaccinationByTaj(taj);
                long days = ChronoUnit.DAYS.between(difference, date);
                if (days < 15) {
                    throw new IllegalArgumentException("A két oltás között legalább 15 napnak kell eltelnie!");
                }

                System.out.println("Adja meg a vakcina tipusát:");
                if (covidDao.getVaccinationNumberByTaj(taj) > 0) {
                    System.out.println("Használható oltóanyag:" + covidDao.getVaccineTypeByTaj(taj));
                }
                VaccinType type = VaccinType.valueOf(sc.nextLine().toUpperCase());
                if (covidDao.getVaccinationNumberByTaj(taj) < 2) {
                    covidDao.vaccinate(taj, date, type);
                    covidDao.updateVaccinationNumberAndDateByTaj(taj, date);
                } else {
                    throw new IllegalArgumentException("A páciens már két oltással rendelkezik");
                }
                System.out.println("Sikeres oltás");
                break;
            }
            //Oltas meghiusulas -----------------------------------------------------------------------------------------------------------------------
            case 5: {
                System.out.println("Adja meg a TAJ számot:");
                String taj = sc.nextLine();
                if (!validators.validateTaj(taj)) {
                    throw new IllegalArgumentException("Helytelen TAJ szám");
                }

                System.out.println("Adja meg a dátumot(pl:" + LocalDate.now() + "):");
                LocalDate date = LocalDate.parse(sc.nextLine());

                System.out.println("Meghiusulás oka?:");
                String note = sc.nextLine();

                covidDao.rejectVaccination(taj, date, note);
                break;
            }
            //RIPORT -----------------------------------------------------------------------------------------------------------------------------
            case 6: {
                System.out.println("Adja meg az irányítószámot:");
                String zip = sc.nextLine();
                if (validators.isZipCodeEmpty(zip)) {
                    throw new IllegalArgumentException("Az írányítószám nem lehet üres!");
                }

                System.out.println("0 Oltással rendelkezők=" + covidDao.getCountOfCitizensByVaccinationNumber(0, zip));
                System.out.println("1 Oltással rendelkezők=" + covidDao.getCountOfCitizensByVaccinationNumber(1, zip));
                System.out.println("2 Oltással rendelkezők=" + covidDao.getCountOfCitizensByVaccinationNumber(2, zip));
                break;
            }
            default: {
                System.out.println("Ez a menüpont nem létezik");
            }
        }
    }
}
