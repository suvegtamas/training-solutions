package week14d04;

import java.util.List;

public class ContractCreator {

    private Contract contract;

    public ContractCreator(String client, List<Integer> monthlyPrices) {
        this.contract = new Contract(client,monthlyPrices);
    }
    public Contract create(String name) {
        Contract newContract = new Contract(name,contract.getMonthlyPrices());
        return newContract;
    }
}
