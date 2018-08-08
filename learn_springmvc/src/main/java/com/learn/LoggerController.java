package com.learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wuxiang on 2018/8/8 17:00
 */
@Controller
@RequestMapping("/log")
public class LoggerController {

    private static final Logger logger = LoggerFactory.getLogger(LoggerController.class);

    @RequestMapping("/index")
    @ResponseBody
    public String testLogger() {
        logger.info("---1---");
        logger.error("---2---");
        logger.warn("---3---");
        return "result";
    }
}
