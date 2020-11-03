package introcontrol;

public class IntroControlMain {
    public static void main(String[] args) {
        IntroControl introcontrol = new IntroControl();

        System.out.println(introcontrol.substractTenIfGreaterThanTen(10));
        System.out.println(introcontrol.substractTenIfGreaterThanTen(13));
        System.out.println(introcontrol.substractTenIfGreaterThanTen(0));

        System.out.println(introcontrol.describeNumber(5));
        System.out.println(introcontrol.describeNumber(0));

        System.out.println(introcontrol.greetingToJoe("Joe"));
        System.out.println(introcontrol.greetingToJoe("Aladin"));

        System.out.println(introcontrol.calculateBonus(10000000));
        System.out.println(introcontrol.calculateBonus(1000000));
        System.out.println(introcontrol.calculateBonus(1000));

        System.out.println(introcontrol.calculateConsumption(999,9999));
        System.out.println(introcontrol.calculateConsumption(999,99));

        System.out.println("printNumbers");
        introcontrol.printNumbers(8);

        System.out.println("printNumbersBetween");
        introcontrol.printNumbersBetween(1,10);
        introcontrol.printNumbersBetween(1,3);

        System.out.println("PrintNumbersBetweenAnyDirection");
        introcontrol.printNumbersBetweenAnyDirection(7,3);
        introcontrol.printNumbersBetweenAnyDirection(7,12);

        System.out.println("printOddNumbers");
        introcontrol.printOddNumbers(13);
    }
}
