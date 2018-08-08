package com.spring.spittr.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Wuxiang on 2017/4/2.
 * HomeController能够映射 "/" 和 "homePage" 两个请求
 */
@Controller
@RequestMapping({"/","/homePage"})
public class HomeController {
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        logger.info("Welcome to MySpring!!!");
        return "index";
    }

    @RequestMapping(value = "/spittr", method = RequestMethod.GET)
    public String home() {
        logger.info("Welcome to Spittr!!!");
        return "spittr/home";
    }

    //为了能够使用重定向，统一模版，使用JSP，不使用Thymeleaf
    @RequestMapping("/thymeleaf")
    @ResponseBody
    public String testThymeleaf() {
        return "服务器异常！！！";
//        return "templates/home";
    }
}
