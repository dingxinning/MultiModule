package com.employee.controller;

import com.employee.service.EmployeeManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2016/11/22.
 * 简单的查询数据
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeManager manager;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public String getAllEmployees(Model model) {
        model.addAttribute("employees", manager.getAllEmployees());
        return "employee/employeeListDisplay";
    }

    //访问http://localhost:8080/employee/getAll
}