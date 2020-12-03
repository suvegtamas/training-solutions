package week06d04.junior;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Budget {
        private List<Item> items = new ArrayList<>();

    public Budget(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItemByMonth(int month) {
        List<Item> result = new ArrayList<>();
        for (Item i : items) {
            if ( i.getMonth() == month) {
                result.add(i);
            }
        }
        return result;
    }



        /* Készíts az week06d04 csomagban egy Budget osztályt, amely a konstruktorában Item példányokat vár listában (List).
    Az Item tartalmazza az alábbi attribútumokat: int price, int month, String name. A Budget osztály tárolja el egy
    attribútumban a konstruktorban megkapott items listát. Írjunk egy metódust, getItemsByMonth néven, mely egy hónapot
    vár (1-12) és visszaadja a kiadásainkat az adott hónapban! Bónusz feladat: ellenőrizzük a bemeneti paramétereket és
    írjunk tesztet!*/
}
