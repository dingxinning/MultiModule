package com.spring.spittr.controller;

import com.spring.spittr.repository.SpittleInfo;
import com.spring.spittr.service.SpittleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


/**
 * Created by Wuxiang on 2017/4/2.
 * 有个问题：在同时使用JSP和Thymeleaf的时候，无法使用重定向redirect
 * 用重定向的话，要统一模版，不能同时使用JSP和Thymeleaf两种模版
 * 即，要使用redirect，不能有ThymeleafViewResolver，不能使用viewNames
 */
@Controller
@RequestMapping("/spittle")
public class SpittleController {
    @Autowired
    SpittleService spittleService;

    @RequestMapping(method = RequestMethod.GET)
    public String spittles(Model model,
                           @RequestParam(required = false,defaultValue = "10") int count) {
        model.addAttribute("spittleList", spittleService.createSpittleList(count));
        return "spittr/spittles";
    }

    @RequestMapping("/register")
    public String registerForm() {
        return "spittr/registerForm";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@ModelAttribute SpittleInfo spittleInfo,
                           RedirectAttributes model){
        SpittleInfo spittleInfo1 = spittleService.register(spittleInfo);
        model.addFlashAttribute("spitter", spittleInfo1);
        model.addAttribute("id", spittleInfo1.getId());
        return "redirect:/spittle/{id}";
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public String spittle(@PathVariable("id") Long id,
                          @ModelAttribute("spitter") SpittleInfo spittleInfo,
                          Model model) {
        if (model.containsAttribute("spitter")) {
            model.addAttribute("spittle", spittleInfo);
        }else {
            model.addAttribute("spittle", spittleService.findOne(id));
        }
        return "spittr/spittle";
    }

}
