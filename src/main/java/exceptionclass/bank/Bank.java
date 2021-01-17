package exceptionclass.bank;

import java.util.List;

public class Bank {
    private List<Account> accountList;

    public Bank(List<Account> accountList) {
        if(accountList == null) {
            throw new IllegalArgumentException("List is null");
        }
        this.accountList = accountList;
    }

    public void payment(String account,double amount) {
        if (account.length() > 4) {
            throw new InvalidBankOperationException(ErrorCode.INVALID_ACCOUNT_NUMBER);
        }
        for(Account a : accountList) {
            if(a.getAccountNumber().equals(account)) {
                a.subtract(amount);
            }
        }
    }

    public void deposit(String account,double amount) {
        if (account.length() > 4) {
            throw new InvalidBankOperationException(ErrorCode.INVALID_ACCOUNT_NUMBER);
        }
        for (Account a : accountList) {
            if (a.getAccountNumber().equals(account)) {
                a.deposit(amount);
            }
        }
    }


}
