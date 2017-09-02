package com.boot.controller;

import com.boot.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Wuxiang on 2017/9/2.
 */
@RestController
public class OrdeController {

    @Autowired
    OrderService orderService;

    @RequestMapping(value = "/order",method = RequestMethod.GET)
    public String addOrder() {
        orderService.addOrder();
        System.out.println("保存成功！！！");
        return "保存成功！";
    }
}
