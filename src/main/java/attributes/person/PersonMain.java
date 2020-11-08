package attributes.person;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("Steve","testCard");
        Address address = new Address("USA","Arizona","43","5567");

        person.moveTo(address);
        System.out.println(person.personToString());
        System.out.println(person.getName());
        System.out.println(person.getAddress().addressToString());
        System.out.println(person.getIdentificationCard());
        System.out.println(address.getCity());
        System.out.println(address.getCountry());
        System.out.println(address.getStreetNumber());
        System.out.println(address.getZipCode());

        person.correctData("Peter", "Driving Licence");
        System.out.println(person.personToString());

        address.correctData("Canada","Ottawa", "Carls Street", "45667");
        System.out.println(person.getAddress().addressToString());

    }
}
