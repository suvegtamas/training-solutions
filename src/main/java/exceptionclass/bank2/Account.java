package exceptionclass.bank2;


public class Account {
    private final String accountNumber;
    private double balance;
    private double maxSubtract;

    public Account(String accountNumber, double balance) {
        if(accountNumber == null) {
            throw new IllegalArgumentException();
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.maxSubtract = 100_000;
    }

    public double subtract(double amount) {
        if(amount < 1) {
            throw new InvalidAmountBankOperationException();
        }
        if (balance < amount) {
            throw new LowBalanceBankOperationException();
        }
        this.balance -= amount;
        return this.balance;
    }
    public double deposit(double amount) {
        if(amount < 0) {
            throw new InvalidAmountBankOperationException();
        }
        if (balance < amount) {
            throw new LowBalanceBankOperationException();
        }
        this.balance += amount;
        return this.balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getMaxSubtract() {
        return maxSubtract;
    }

    public void setMaxSubtract(double maxSubtract) {
        if(maxSubtract < 1) {
            throw new InvalidAmountBankOperationException();
        }
        this.maxSubtract = maxSubtract;
    }
}

