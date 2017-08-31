package com.restTemplate.controller;

import com.alibaba.fastjson.JSON;
import com.restTemplate.entity.RestUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Wuxiang on 2017/8/31.
 */
@Controller
@RequestMapping("/restTemplate")
public class RestUserController {

    @RequestMapping(value = "/user/{id}/{age}", method = RequestMethod.GET, produces="text/html;charset=UTF-8")
    @ResponseBody
    public String getUser(@PathVariable int id,@PathVariable int age) {
        RestUser restUser = new RestUser(id, age, "王图");
        return JSON.toJSONString(restUser);
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    @ResponseBody
    public String postUser(@RequestBody RestUser restUser) {
        return restUser.toString();
    }
}
