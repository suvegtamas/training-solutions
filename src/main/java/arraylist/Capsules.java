package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Capsules {
    private List<String> colors = new ArrayList<>();


    public void addLast(String item) {
        colors.add(item);
    }

    public void addFirst(String item) {
        colors.add(0, item);
    }

    public void removeFirst() {
        colors.remove(0);
    }

    public void removeLast() {
        colors.remove(colors.size() - 1);
    }

    public List<String> getColors() {
        return colors;
    }

    public static void main(String[] args) {
        Capsules capsules = new Capsules();
        System.out.println("Colors");
        capsules.addLast("Blue");
        capsules.addLast("Brown");
        capsules.addLast("Blue");
        capsules.addFirst("Red");
        capsules.addFirst("Yellow");
        capsules.removeFirst();
        capsules.removeLast();

        System.out.println(capsules.getColors());

        List <String> testVariable = capsules.getColors();
        System.out.println(testVariable);
        testVariable.clear();
        System.out.println(testVariable);


    }
}
