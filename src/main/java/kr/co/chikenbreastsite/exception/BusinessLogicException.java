package kr.co.chikenbreastsite.exception;

import lombok.Getter;

@Getter
public class BusinessLogicException extends RuntimeException{
    private ErrorCodeType errorCodeType;

    public BusinessLogicException(ErrorCodeType errorCodeType) {
        super(errorCodeType.getMessage());
        this.errorCodeType = errorCodeType;
    }
}
