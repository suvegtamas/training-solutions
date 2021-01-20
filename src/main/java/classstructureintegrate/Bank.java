package classstructureintegrate;

import classstructureintegrate.BankAccount;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Account number?");
        String accountNumber = scanner.nextLine();

        System.out.println("Owner?");
        String owner = scanner.nextLine();

        System.out.println("New Balance?");
        int amount = scanner.nextInt();
        scanner.nextLine();

        BankAccount account1 = new BankAccount(accountNumber, owner, amount);

        System.out.println("New account number?");
        String accountNumber2 = scanner.nextLine();

        System.out.println("Owner?");
        String owner2 = scanner.nextLine();

        System.out.println("New Balance?");
        int amount2 = scanner.nextInt();

        BankAccount account2 = new BankAccount(accountNumber2, owner2, amount2);

        System.out.println(account1.getInfo());
        System.out.println(account2.getInfo());

        System.out.println("Deposit amount?");
        int depositAmount = scanner.nextInt();
        account1.deposit(depositAmount);

        System.out.println(account1.getInfo());

        System.out.println("Withdraw amount?");
        int withdrawAmount = scanner.nextInt();
        account2.withdraw(withdrawAmount);

        System.out.println(account2.getInfo());

        System.out.println("Transfer amount?");
        int transferAmount = scanner.nextInt();
        account1.transfer(account2, transferAmount);

        System.out.println(account1.getInfo());
        System.out.println(account2.getInfo());
    }

}
