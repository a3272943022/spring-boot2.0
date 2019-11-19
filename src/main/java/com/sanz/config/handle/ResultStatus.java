package com.sanz.config.handle;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author: key
 * @DATE:
 * @CLASSNAME ResultStatus
 */
@Getter
@AllArgsConstructor
public enum ResultStatus {
    SUCCESS(200, "success!"),
    ERROR(300, "request error!"),
    NOT_VALID(400, "not valid!"),
    NOT_FOUND(404, "not found!"),
    REPEAT(405, "resource repeat!"),
    INTERRUPT(301, "something wrong, diy"),
    UNDEFINE(0, "undefine code"),
    FORBIDDEN(403, "token不能为空"),
    FORBIDDENT(403, "token失效,请重新登录"),;


    private Integer code;

    private String name;

    public static ResultStatus getInstanceByCode(final Integer code) {
        for (final ResultStatus exampleCode : ResultStatus.values()) {
            if (exampleCode.code.equals(code)) {
                return exampleCode;
            }
        }
        return UNDEFINE;
    }

    public static ResultStatus getInstanceByName(final String name) {
        for (final ResultStatus exampleCode : ResultStatus.values()) {
            if (exampleCode.name.equals(name)) {
                return exampleCode;
            }
        }
        return UNDEFINE;
    }
}
