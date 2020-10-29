package classstructuremethods;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();
        client.setName("Jeff Goldberg");
        client.setYear(1994);
        client.setAddress("Queens, New York, United States");

        System.out.println("Name: " + client.getName());
        System.out.println("Year:" + client.getYear());
        System.out.println("Address:" + client.getAddress());

        client.migrate(" Berlin, Germany");
        System.out.println("New Address: " + client.getAddress());
    }
}
