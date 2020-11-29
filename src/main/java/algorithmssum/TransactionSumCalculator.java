package algorithmssum;

import java.util.List;

public class TransactionSumCalculator {
    public int sumAmountOfCreditEntries(List<Transaction> transaction) {
        int sum = 0;
        for (Transaction t : transaction) {
            if (t.isCredit()) {
                sum += t.getAmount();
            }
        }
        return sum;
    }
}
