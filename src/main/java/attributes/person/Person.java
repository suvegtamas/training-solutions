package attributes.person;

public class Person {
    private String name;
    private String identificationCard;
    private Address address;

    public String personToString() {
        String person = name.toString() + " " + identificationCard.toString();
        return person;
    }

    public Person(String name, String identificationCard) {
        this.name = name;
        this.identificationCard = identificationCard;
    }

    public String getName() {
        return name;
    }

    public String getIdentificationCard() {
        return identificationCard;
    }
    public void correctData(String name, String identificationCard) {
        this.name = name;
        this.identificationCard = identificationCard;

    }
    public void moveTo(Address otherAddress) {
        address = otherAddress;
    }
    public Address getAddress() {
        return address;
    }
}
