package com.sanz.config.handle;

import java.util.Optional;

/**
 * @author: key
 * @DATE: 2019/11/19 13 : 39
 * @CLASSNAME BusinessException
 */
public class BusinessException extends RuntimeException {
    /**
     * @param code back code
     */
    private Integer code;
    /**
     * @param message message;
     */
    private String message;

    public BusinessException() {
        super();
    }

    public BusinessException(String message) {
        super();
        this.code = ResultStatus.INTERRUPT.getCode();
        this.message = message;
    }

    public BusinessException(ResultStatus code) {
        super();
        this.code = code.getCode();
        this.message = code.getName();
    }

    public BusinessException(Integer code, String message) {
        super();
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        this.message = Optional.ofNullable(message).orElse(super.getMessage());
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
