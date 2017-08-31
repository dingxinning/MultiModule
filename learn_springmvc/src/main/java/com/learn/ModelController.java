package com.learn;

import com.learn.entity.TestInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Wuxiang on 2017/7/19.
 */
@Controller
@RequestMapping("/model")
public class ModelController {

    // Controller 返回页面
    @RequestMapping("/model")
    public String modelPage() {
        System.out.println("Controller Page!!!");
        return "learn/model";
    }

    // Controller 返回数据
    @RequestMapping("/data")
    @ResponseBody
    public String data() {
        return "Controller data!!!";
    }

    //Model 包含四个addAttribute 和一个  merAttribute方法的接口
    //向页面返回处理数据
    @RequestMapping("/testModel")
    public String greeting(Model model) {
        model.addAttribute("name", "Quick start!");
        model.addAttribute("age", 18);
        return "learn/testModel";
    }

    //ModelMap 向页面返回处理数据
    @RequestMapping("/testModelMap")
    public String test(ModelMap modelMap) {
        TestInfo infoA = new TestInfo();
        infoA.setId((long) 1);
        infoA.setName("Bob");
        infoA.setBirth(new Date());
        TestInfo infoB = new TestInfo();
        infoB.setId((long) 2);
        infoB.setName("Tom");
        infoB.setBirth(new Date());

        modelMap.addAttribute("a", infoA);
        modelMap.put("b", infoB);   //ModelMap 实现了map接口，包含map的方法
        return "learn/testModelMap";
    }

    //ModelAndView 两个作用   1.向页面返回处理数据   2.设置转向地址
    //ModelAndView多用在 @RestController中，即含有@ResponseBody注解
    @RequestMapping("/testModelAndView")
    @ResponseBody
    public ModelAndView testMAV() {
        TestInfo infoA = new TestInfo();
        infoA.setId((long) 3);
        infoA.setName("Lady");
        infoA.setBirth(new Date());
        TestInfo infoB = new TestInfo();
        infoB.setId((long) 4);
        infoB.setName("Sim");
        infoB.setBirth(new Date());

        ModelAndView view = new ModelAndView("learn/testModelMap");
        view.addObject("a", infoA);
        view.addObject("b", infoB);
        return view;
    }

    // 测试 jsp 的循环
    @RequestMapping("/testModelForEach")
    public String testModelForEach(ModelMap modelMap) {
        List<TestInfo> infos = new ArrayList<>();
        infos.add(new TestInfo((long) 1, "wx1", new Date()));
        infos.add(new TestInfo((long) 2, "wx2", new Date()));
        infos.add(new TestInfo((long) 3, "wx3", new Date()));
        infos.add(new TestInfo((long) 4, "wx4", new Date()));
        infos.add(new TestInfo((long) 5, "wx5", new Date()));
        infos.add(new TestInfo((long) 6, "wx6", new Date()));
        modelMap.addAttribute("infos", infos);
        return "learn/testModelForEach";
    }
}
