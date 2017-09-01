package com.restTemplate;

import com.alibaba.fastjson.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;


/**
 * Created by Wuxiang on 2017/8/31.
 *
 * 对应测试 learn_SpringMVC/com/restTemplate
 */
public class TestRestTemplate {
    public static void main(String[] args) {
        // 测试get
        RestTemplate restTemplate = new RestTemplate();
        String string = restTemplate.getForObject("http://localhost:8080/restTemplate/user/22/55", String.class);
        System.out.println(string);

        // 测试post
        HttpHeaders headers = new HttpHeaders();
        MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
        headers.setContentType(type);
        headers.add("Accept", MediaType.APPLICATION_JSON.toString());

        JSONObject parm = new JSONObject();
        parm.put("id", 1);
        parm.put("age", 17);
        parm.put("name", "小王");
        parm.put("address", "广东揭西");
        parm.put("hobay", "篮球");

        HttpEntity<String> formEntity = new HttpEntity<>(parm.toString(), headers);
        String result = restTemplate.postForObject("http://localhost:8080/restTemplate/user", formEntity, String.class);
        System.out.println(result);
    }
}