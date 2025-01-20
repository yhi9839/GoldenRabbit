package GoldenRabbit.Buzz.apiPayLoad.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import GoldenRabbit.Buzz.apiPayLoad.code.BaseErrorCode;
import GoldenRabbit.Buzz.apiPayLoad.code.ReasonDTO;

@Getter
@AllArgsConstructor
public class GeneralException extends RuntimeException{
    private BaseErrorCode code;

    public ReasonDTO getErrorReason() {
        return this.code.getErrorReason();
    }

    public ReasonDTO getErrorReasonHttpStatus(){
        return this.code.getErrorReasonHttpStatus();
    }
}
