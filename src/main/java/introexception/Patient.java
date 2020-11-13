package introexception;

public class Patient {
    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;

    public Patient(String name, String socialSecurityNumber, int yearOfBirth) {
        this.name = name;
        if ( name == " ") {
            throw new IllegalArgumentException("Wrong name:" + name);
        }
        this.socialSecurityNumber = socialSecurityNumber;

        this.yearOfBirth = yearOfBirth;
        if ( yearOfBirth < 1900) {
            throw new IllegalArgumentException("Could not resolve: " + yearOfBirth);
        }
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
