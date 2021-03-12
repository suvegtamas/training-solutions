package covid;

public class City {
    private String zipCode;
    private String name;

    public City(String zipCode, String name) {
        this.zipCode = zipCode;
        this.name = name;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "City{" +
                "zipCode='" + zipCode + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
