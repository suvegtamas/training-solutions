package algorithmsdecision;

import java.util.List;

public class BankAccountDecisionMaker {
    public boolean containsBalanceGreaterThan(List<BankAccount> accounts, int min) {
        for (BankAccount bank : accounts) {
            if (bank.getBalance() > min) {
                return true;
            }
        }
        return false;
    }
}
