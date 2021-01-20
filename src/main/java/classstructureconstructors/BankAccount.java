package classstructureconstructors;

public class BankAccount {
    private String accountNumber;
    private String owner;
    private int balance;

    public BankAccount(String accountNumber, String owner, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;
    }
    public void deposit(int amount) {
        balance = balance + amount;
    }
    public void withdraw(int amount) {
        balance = balance - amount;
    }
    public void transfer(BankAccount to, int amount) {
        withdraw(amount);
        to.deposit(amount);
    }
    public String getInfo() {
        return owner + " (" + accountNumber + "):" + balance + " Ft";
    }
}
