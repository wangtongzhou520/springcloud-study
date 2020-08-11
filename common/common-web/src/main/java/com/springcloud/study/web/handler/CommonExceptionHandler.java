package com.springcloud.study.web.handler;

import com.springcloud.study.common.core.vo.CommonResponse;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 公共的全局异常处理器
 *
 * @author wangtongzhou
 * @since 2020-08-11 17:35
 */
@RestControllerAdvice
public class CommonExceptionHandler {


    @ExceptionHandler({MethodArgumentNotValidException.class})
    public CommonResponse methodArgumentTypeMismatchExceptionHandler(MethodArgumentNotValidException ex) {
        FieldError fieldError = ex.getBindingResult().getFieldError();
        return null;
    }

}
