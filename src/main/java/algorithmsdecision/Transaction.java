package algorithmsdecision;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Transaction {
    private String accountNumber;
    private TransactionOperation transactionOperation;
    private int amount;
    LocalDateTime dateOfTransaction;
    private StatusType status;

    public Transaction(String accountNumber, TransactionOperation transactionOperation, int amount, LocalDateTime dateOfTransaction) {
        this.accountNumber = accountNumber;
        this.transactionOperation = transactionOperation;
        this.amount = amount;
        this.dateOfTransaction = dateOfTransaction;
        status = StatusType.CREATED;
    }

    public boolean isDebit() {
        return transactionOperation == TransactionOperation.DEBIT;
    }

    public boolean isCredit() {
        return transactionOperation == TransactionOperation.CREDIT;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getAmount() {
        return amount;
    }

    public LocalDateTime getDateOfTransaction() {
        return dateOfTransaction;
    }
    public void setWhenSuccess() {
        status = StatusType.SUCCEEDED;
    }
    public void setWhenPending() {
        status = StatusType.PENDING;
    }
}
