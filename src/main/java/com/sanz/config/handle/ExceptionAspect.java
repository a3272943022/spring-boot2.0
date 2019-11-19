package com.sanz.config.handle;

import com.sanz.workbench.dto.ParameteralueDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Optional;

/**
 * 异常控制器
 * @author: key
 * @DATE: 2019/11/19 13 : 25
 * @CLASSNAME ExceptionAspect
 */
@RestControllerAdvice
@ControllerAdvice
public class ExceptionAspect {
    @ResponseBody
    @ExceptionHandler(value = {Exception.class,RuntimeException.class})
    public ResponseEntity handleException(Exception ex) {
        ex.printStackTrace();
        ParameteralueDto result = new ParameteralueDto();
        if(ex instanceof BusinessException){
            BusinessException businessException = (BusinessException)ex;
            result.setMsg(businessException.getMessage());
            result.setCode(businessException.getCode().toString());
            return ResponseEntity.ok(result);
        }
        String message = Optional.ofNullable(ex.getMessage()).orElse("系统异常");
        result.setCode(ResultStatus.ERROR.getCode().toString());
        result.setMsg(message);
        return ResponseEntity.ok(result);
    }
}
