package com.spring.spittr.web;

import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Created by Wuxiang on 2017/4/3.
 */
//@ControllerAdvice
public class SpittrExceptionHandler {

    @ExceptionHandler(Exception.class)
    public String error(Exception e) {
        System.out.println(e.getMessage());
        return "views/spittr/error";
    }
}
