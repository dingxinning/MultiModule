package com.spring.restful;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Wuxiang on 2017/4/10.
 * RESTful 关键：资源  表现层  状态转换
 * for example
 ● GET：获取资源
 http://localhost:8080/resource/001
 ● POST：创建资源，不具有幂等性
 http://localhost:8080/resource/001
 ● PUT：创建（更新）资源
 http://localhost:8080/resource/001
 ● DELETE：删除资源
 http://localhost:8080/resource/001
 */
@RestController
@RequestMapping("/resource")
public class RestFulController {

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String getResource(@PathVariable String id) {
        return "this is a get method,the resource's id is " + id;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public String postResource(@PathVariable String id) {
        return "this is a post method,the resource's id is " + id;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteResource(@PathVariable String id) {
        return "this is a delete method,the resource's id is " + id;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String putResource(@PathVariable String id) {
        return "this is a put method,the resource's id is " + id;
    }
}
