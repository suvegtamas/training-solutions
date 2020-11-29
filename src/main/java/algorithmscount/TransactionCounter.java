package algorithmscount;

import java.util.List;

public class TransactionCounter {
    public int countEntryLessThan(List<Transaction> transactions, int minTransaction) {
        int count = 0;
        for (Transaction t : transactions) {
            if ( t.getAmount() < minTransaction) {
                count++;
            }
        }
        return count;
    }
}
