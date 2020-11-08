package introconstructors;

public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("Shiny Pearl", 40);

        System.out.println(restaurant.getCapacity());

        System.out.println(restaurant.getMenu());
        System.out.println(restaurant.getName());
    }
}
