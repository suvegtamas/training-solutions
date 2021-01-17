package exceptionclass.bank2;

import exceptionclass.bank.Account;
import exceptionclass.bank.ErrorCode;
import exceptionclass.bank.InvalidBankOperationException;

import java.util.List;

public class Bank {
    private final List<exceptionclass.bank.Account> accountList;

    public Bank(List<exceptionclass.bank.Account> accountList) {
        if(accountList == null) {
            throw new IllegalArgumentException("List is null");
        }
        this.accountList = accountList;
    }

    public void payment(String account,double amount) {
        if (account.length() > 4) {
            throw new InvalidBankOperationException(ErrorCode.INVALID_ACCOUNT_NUMBER);
        }
        for(exceptionclass.bank.Account a : accountList) {
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
