package lambdaintro;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class BankAccounts {
    private List<BankAccount> bankAccounts;

    public BankAccounts(List<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    public List<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public List<BankAccount> listBankAccountsByAccountNumber() {
        List<BankAccount> result = new ArrayList<>(bankAccounts);
        result.sort((b1,b2) -> b1.getAccountNumber().compareTo(b2.getAccountNumber()));
        return result;
    }

    public List<BankAccount> listBankAccountsByBalance() {
        List<BankAccount> result = new ArrayList<>(bankAccounts);
        result.sort(Comparator.comparing(b1 -> Math.abs(b1.getBalance())));
        return result;
    }

    public List<BankAccount> listBankAccountsByBalanceDesc() {
        List<BankAccount> result = new ArrayList<>(bankAccounts);
        result.sort(Comparator.comparing(BankAccount::getBalance).reversed());
        return result;
    }

    public List<BankAccount> listBankAccountsByNameThanAccountNumber() {
        List<BankAccount> result = new ArrayList<>(bankAccounts);
        Collator collator = Collator.getInstance(new Locale("hu", "HU"));

        result.sort(
                Comparator.comparing(BankAccount::getNameOfOwner,
                        Comparator.nullsFirst(collator))
                        .thenComparing(BankAccount::getAccountNumber));
        return result;
    }
}
