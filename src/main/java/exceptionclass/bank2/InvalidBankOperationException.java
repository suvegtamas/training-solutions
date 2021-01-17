package exceptionclass.bank2;

import exceptionclass.bank.ErrorCode;

public class InvalidBankOperationException extends  RuntimeException {
    private final ErrorCode errorCode;

    public InvalidBankOperationException(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }
}
