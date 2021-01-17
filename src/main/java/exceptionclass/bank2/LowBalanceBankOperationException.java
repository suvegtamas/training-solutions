package exceptionclass.bank2;

import exceptionclass.bank.ErrorCode;

public class LowBalanceBankOperationException extends InvalidBankOperationException{
    public LowBalanceBankOperationException() {
        super(ErrorCode.LOW_BALANCE);
    }
}
