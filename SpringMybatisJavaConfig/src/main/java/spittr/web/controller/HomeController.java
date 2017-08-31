package spittr.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by Wuxiang on 2017/4/7.
 */
@Controller
public class HomeController {
    @RequestMapping(value="/", method=GET)
    public String home(){
        return "home";
    }
}