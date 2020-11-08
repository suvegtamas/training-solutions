package attributes.person;

public class Address {
    private String country;
    private String city;
    private String streetNumber;
    private String zipCode;

    public String addressToString() {
       String address = country.toString() + " - " + city.toString() + " - " + streetNumber.toString() + " - " + zipCode.toString();
       return address;
    }

    public Address(String country, String city, String streetNumber, String zipCode) {
        this.country = country;
        this.city = city;
        this.streetNumber = streetNumber;
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public String getZipCode() {
        return zipCode;
    }
    public void correctData(String country, String city, String streetNumber, String zipCode) {
        this.country = country;
        this.city = city;
        this.streetNumber = streetNumber;
        this.zipCode = zipCode;

    }

}
