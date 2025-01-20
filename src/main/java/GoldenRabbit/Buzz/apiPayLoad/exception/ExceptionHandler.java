package GoldenRabbit.Buzz.apiPayLoad.exception;

import GoldenRabbit.Buzz.apiPayLoad.code.BaseErrorCode;

public class ExceptionHandler extends GeneralException {
    public ExceptionHandler(BaseErrorCode code) {
        super(code);
    }
}