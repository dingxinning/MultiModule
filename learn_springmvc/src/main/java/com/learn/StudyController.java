package com.learn;

import com.learn.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/11/22.
 * 加上ResponseBody后返回结果不会解析为跳转路径
 */
@Controller
public class StudyController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello string (@ResponseBody)";
    }

    @RequestMapping("/study")
    public String studyJSP() {
        return "learn/study";
    }

    @RequestMapping("/showInfo")
    public String showInfo(Model model) {
        model.addAttribute("message", "asdasdasdas");

        List<Person> people = new ArrayList<>();
        people.add(new Person(1, "aaa", true));
        people.add(new Person(2, "bbbb", false));
        people.add(new Person(3, "dfff", true));
        model.addAttribute("people", people);
        return "learn/show";
    }
}
