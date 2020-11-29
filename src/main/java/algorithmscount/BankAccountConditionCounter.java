package algorithmscount;

import java.util.List;

public class BankAccountConditionCounter {
    public int amountCounter(List<BankAccount> bankAccount, int minBalance) {
        int count = 0;
        for (BankAccount bankA : bankAccount) {
            if ( bankA.getBalance() > minBalance) {
                count++;
            }
        }
        return count;
    }
}
