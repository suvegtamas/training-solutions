package array;

import java.lang.reflect.Array;

public class ArrayHandler {
    public boolean contains(int[] source, int itemToFind) {
        for ( int i = 0; i < source.length; i++) {
            if ( i == itemToFind) {
                return true;
            }
        } return false;
    }
    public int find(int[] source, int itemToFind) {
        for (int i = 0; i < source.length; i++ ) {
            if (source[i] == itemToFind) {
                return i;
            }
        } return -1;
    }

    public static void main(String[] args) {
        ArrayHandler arrayH = new ArrayHandler();
        int[] array1 = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println(arrayH.contains(array1, 5));
        System.out.println(arrayH.find(array1, 4));
    }
}
