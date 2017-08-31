package com.learn;

import com.alibaba.fastjson.JSON;
import com.learn.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2016/12/13.
 */
@Controller
public class PersonController {

    @RequestMapping(value = "/person/{id}/{name}/{status}", method = RequestMethod.GET)
    @ResponseBody
    public String porfile(@PathVariable("id") int id,
                          @PathVariable("name") String name,
                          @PathVariable("status") boolean status) {
        Person person = new Person(id, name, status);
        return JSON.toJSONString(person);
        //ResponseBody会将对象转换为JSON对象，传到前台，缺少包的话（406错误）
    }

    @RequestMapping(value = "/person/login", method = RequestMethod.POST)
    @ResponseBody
    public Person login(@RequestBody Person person) {
        return person;
    }
}
