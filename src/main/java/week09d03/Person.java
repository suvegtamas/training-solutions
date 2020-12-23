package week09d03;

import java.util.Random;

public class Person {
    private String name;
    private int age;
    private Present present;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setPresent() {
        Random rnd = new Random();
        if ( age > 14) {
            this.present = Present.values()[rnd.nextInt(Present.values().length-1)+1];
        } else {
            this.present = Present.values()[rnd.nextInt(Present.values().length)];
        }
        if ( age < 13) {
            this.present = Present.Toy;
        }

    }


    public Present getPresent() {
        return present;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", present=" + present +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
