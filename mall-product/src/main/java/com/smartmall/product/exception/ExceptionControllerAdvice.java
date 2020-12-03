package com.smartmall.product.exception;

import com.smartmall.common.exception.ExceptionEnum;
import com.smartmall.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Miaojiale on 2020/11/27.
 */

// RestControllerAdvice = ControllerAdvice + ResponseBody
@Slf4j
@RestControllerAdvice(basePackages = "com.smartmall.product.controller")
public class ExceptionControllerAdvice {

    @ResponseBody
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public R exceptionValidationHandler(MethodArgumentNotValidException e) {
        log.error("========================= MethodArgumentNotValidException ERROR: " + e.getMessage());
        BindingResult bindingResult = e.getBindingResult();
        Map<String, String> map = new HashMap<>();
        bindingResult.getFieldErrors().forEach((b) -> map.put(b.getField(), b.getDefaultMessage()));
        return R.error(ExceptionEnum.Valid_Fail.getCode(), ExceptionEnum.Valid_Fail.getDesc()).put("data",map);
    }

    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public R exceptionHandler(Exception e) {
        log.error("=========================ERROR: " + e.getMessage());
        return R.error(400, e.getMessage());
    }
}
