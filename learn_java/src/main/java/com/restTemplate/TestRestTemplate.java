package com.restTemplate;

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

        // todo 测试post
    }
}