package exceptionclass.bank2;

import exceptionclass.bank.ErrorCode;

public class InvalidAccountNumberBankOperationException extends InvalidBankOperationException {

    public InvalidAccountNumberBankOperationException() {
        super(ErrorCode.INVALID_ACCOUNT_NUMBER);
    }
}
