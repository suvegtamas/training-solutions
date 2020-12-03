package week06d04.junior;

public class Item {
    private String name;
    private int month;
    private int price;

    public Item(String name, int month, int price) {
        if (name == null || "".equals(name)) {
            throw new IllegalArgumentException("Name must be given");
        }
        if (month <=0 ||month > 12) {
            throw new IllegalArgumentException("Month has to be between 1-12");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Price can't be negative.");
        }
        this.name = name;
        this.month = month;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getMonth() {
        return month;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " " + month +" " + price;

    }
    /* Készíts az week06d04 csomagban egy Budget osztályt, amely a konstruktorában Item példányokat vár listában (List).
    Az Item tartalmazza az alábbi attribútumokat: int price, int month, String name. A Budget osztály tárolja el egy
     attribútumban a konstruktorban megkapott items listát. Írjunk egy metódust, getItemsByMonth néven, mely egy hónapot
     vár (1-12) és visszaadja a kiadásainkat az adott hónapban! Bónusz feladat: ellenőrizzük a bemeneti paramétereket és
     írjunk tesztet!*/
}
