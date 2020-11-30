package algorithmsdecision;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class TransactionDecision {
    public boolean transactionIsBefore(List<Transaction> transactions, LocalDateTime before, LocalDateTime after, int min) {
        for (Transaction t : transactions) {
            if (t.isDebit() && t.getDateOfTransaction().isAfter(before) && t.getDateOfTransaction().isBefore(after) && t.getAmount() > min) {
                return true;
            }
        }
        return false;
    }
}
