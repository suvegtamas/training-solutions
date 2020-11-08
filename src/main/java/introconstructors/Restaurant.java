package introconstructors;

import java.util.Arrays;
import java.util.List;

public class Restaurant {
    private List<String> menu;
    private String name;
    private int capacity;

    public Restaurant(String name,int numberOfTables) {
        this.name = name;
        this.capacity = numberOfTables * 4;
        this.menu = addMenu();

    }
    private List<String> addMenu() {
        List<String> menu =  Arrays.asList("1. Chicken Burger", "2. French Fries" , "3. Something vegetarian" );
        return menu;
    }

    public List<String> getMenu() {
        return menu;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }
}
