package com.spring.pizza.service;

/**
 * Created by Wuxiang on 2017/4/4.
 */
@SuppressWarnings("serial")
public class CustomerNotFoundException extends Exception {
    public CustomerNotFoundException() {}

    public CustomerNotFoundException(String message) {
        super(message);
    }
}
