package statements;

import java.util.Scanner;

public class InvestmentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Befektetesi osszeg:");
        int deposit = scanner.nextInt();
        System.out.println("Kamatlab:");
        int interestRate = scanner.nextInt();
        Investment investment = new Investment(deposit, interestRate);

        System.out.println("Toke:" + investment.getFund());
        System.out.println("Hozam 50 napra:" + investment.getYield(50));
        System.out.println("Kivett osszeg 80 nap utan: " + investment.close(80));
        System.out.println("Kivett osszeg 90 nap utan: " + investment.close(90));
    }
}
