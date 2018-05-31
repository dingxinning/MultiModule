package com.resttemplate;

import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

/**
 * Created by Wuxiang on 2018/5/31
 * 测试接口的入参出参的格式都为application/json的POST请求
 * 并且都含有Date字段，且序列化和反序列化都有固定格式
 */
public class TestReuturnDate {
    public static void main(String[] args) {

        // RestTemplate 设置超时时间
        HttpComponentsClientHttpRequestFactory httpRequestFactory = new HttpComponentsClientHttpRequestFactory();
        httpRequestFactory.setConnectionRequestTimeout(3000);
        httpRequestFactory.setConnectTimeout(3000);
        httpRequestFactory.setReadTimeout(3000);
        RestTemplate restTemplate = new RestTemplate(httpRequestFactory);

        // 设置格式
        HttpHeaders headers = new HttpHeaders();
        MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
        headers.setContentType(type);
        headers.add("Accept", MediaType.APPLICATION_JSON.toString());

        // 入参拼接使用 JSONObject，该对象 toString() 直接是JSON形式
        JSONObject parm = new JSONObject();
        parm.put("userId", "a0001");
        parm.put("requestDate", "1990-01-01 13:14:00");
        parm.put("code", Arrays.asList("大数据", "Hadoop"));

        // 请求接口
        HttpEntity<String> formEntity = new HttpEntity<>(parm.toString(), headers);
        String result = restTemplate.postForObject("http://localhost:8080/restTemplate/date", formEntity, String.class);
        System.out.println("POST return: " + result);

        // 设置序列化与反序列化的日期格式的 Gson
        // 防止异常：com.google.gson.JsonSyntaxException
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
        Response response = gson.fromJson(result, Response.class);
        System.out.println("接口响应时间：" + response.getResponseDate());
        System.out.println("JSON: " + gson.toJson(response));
    }
}
