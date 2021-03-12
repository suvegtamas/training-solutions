package covid;


import java.time.LocalDateTime;

public class Citizen {
    private final String zipCode;
    private final String name;
    private final int age;
    private final String email;
    private final String taj;
    private int numberOfVaccination;
    private LocalDateTime lastVaccination;

    public Citizen(String name,String zipCode, int age, String email, String taj) {
        this.zipCode = zipCode;
        this.name = name;
        this.age = age;
        this.email = email;
        this.taj = taj;
    }

    public Citizen(String zipCode, String name, int age, String email, String taj, int numberOfVaccination) {
        this.zipCode = zipCode;
        this.name = name;
        this.age = age;
        this.email = email;
        this.taj = taj;
        this.numberOfVaccination = numberOfVaccination;
    }

    public Citizen(String zipCode, String name, int age, String email, String taj, int numberOfVaccination, LocalDateTime lastVaccination) {
        this.zipCode = zipCode;
        this.name = name;
        this.age = age;
        this.email = email;
        this.taj = taj;
        this.numberOfVaccination = numberOfVaccination;
        this.lastVaccination = lastVaccination;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getTaj() {
        return taj;
    }

    public int getNumberOfVaccination() {
        return numberOfVaccination;
    }

    public LocalDateTime getLastVaccination() {
        return lastVaccination;
    }

    @Override
    public String toString() {
        return name + ";" + zipCode + ";" + age + ";" + email + ";" + taj;
    }

}
