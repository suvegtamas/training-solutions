package inheritancemethods;

public class CreditAccount extends DebitAccount {
    private long overdraftLimit;

    public CreditAccount(String accountNumber, long balance, long overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public boolean transaction(long amount) {
        long trx = amount + costOfTransaction(amount);
        if (trx > getBalance() + overdraftLimit) {
            return false;
        }
        if (trx <= getBalance()) {
            super.transaction(amount);
        } else {
            long credit = amount - getBalance();
            balanceToZero();
            overdraftLimit -= credit + costOfTransaction(amount);
        }
        return true;
    }

    public long getOverdraftLimit() {
        return overdraftLimit;
    }
}
