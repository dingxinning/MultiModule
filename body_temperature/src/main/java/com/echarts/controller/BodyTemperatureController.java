package com.echarts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Wuxiang on 2017/7/7.
 * 体温单的绘制
 */
@Controller
@RequestMapping("/body")
public class BodyTemperatureController {

    // My page
    @RequestMapping("/temp")
    public String temperature() {
        return "body_temperature";
    }

    // new page
    @RequestMapping("/new")
    public String newPage() {
        return "body_newpage";
    }

    // change size
    @RequestMapping("/change")
    public String change() {
        return "body_change";
    }
}
