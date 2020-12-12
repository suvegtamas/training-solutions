package inheritancemethod;

public class DebitAccount {
    private String accountNumber;
    private long balance;
    private static final double COST = 3.0;
    private static final long MIN_COST = 200;

    public DebitAccount(String accountNumber, long balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public final long costOfTransaction(long amount) {
        return (amount * COST / 100.0) <= MIN_COST ? MIN_COST : (long) (amount * COST / 100.0);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }
    public boolean transaction(long amount) {
        long trx = amount + costOfTransaction(amount);
        if (trx <= balance) {
            balance -= trx;
            return true;
        }
        return false;
    }
    public void balanceToZero() {
        this.balance = 0;
    }
}
