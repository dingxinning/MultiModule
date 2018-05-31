package com.resttemplate.controller;

import com.alibaba.fastjson.JSON;
import com.resttemplate.entity.Request;
import com.resttemplate.entity.Response;
import com.resttemplate.entity.RestUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

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
        return JSON.toJSONString(restUser);
    }

    @RequestMapping(value = "/date", method = RequestMethod.POST,
            produces = {"application/json; charset=UTF-8"},
            consumes = {"application/json; charset=UTF-8"})
    @ResponseBody
    public Response testDate(@RequestBody Request request) {
        Response response = new Response();
        response.setUserId(request.getUserId());
        response.setOneCode(request.getCode().get(0));
        response.setRequestDate(request.getRequestDate());
        response.setResponseDate(new Date());
        return response;
    }
}
