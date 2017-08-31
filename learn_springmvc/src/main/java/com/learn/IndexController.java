package com.learn;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2016/11/22.
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/index" )
    public String index(){
        return "learn/index";
    }

    @RequestMapping(value = "/success" )
    public String success(){
        System.out.println("to success jsp");
        return "learn/success";
    }

    @RequestMapping("/own/{ownid}/{ownname}")
    @ResponseBody
    public String sd(@PathVariable String ownid,
                     @PathVariable String ownname){
        return  "ownid:"+ownid+" ,  ownname:"+ownname;
    }

    @RequestMapping("/me")
    @ResponseBody
    public String df(@RequestParam(value = "id") int id,
                     @RequestParam(value = "name") String Name){
        return "id="+id+"  ,name="+Name;
    }
}
