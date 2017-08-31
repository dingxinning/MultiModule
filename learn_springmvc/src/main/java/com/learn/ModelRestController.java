package com.learn;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Wuxiang on 2017/7/19.
 */
@RestController
@RequestMapping("/rest")
public class ModelRestController {

    // RestController 返回页面
    @RequestMapping("/model")
    public ModelAndView model() {
        ModelAndView modelAndView = new ModelAndView("learn/model");
        System.out.println("RestController Page!!!");
        return modelAndView;
    }

    // RestController 返回数据
    @RequestMapping("/data")
    public String data() {
        return "RestController data";
    }
}
