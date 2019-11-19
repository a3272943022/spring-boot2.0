package com.sanz.workbench.dto;

import lombok.Data;

/**
 * @author: key
 * @DATE: 2019/11/19 13 : 29
 * @CLASSNAME ParameteralueDto
 */
@Data
public class ParameteralueDto<T> {
    private String msg;
    private String code;
    private T body;
}
