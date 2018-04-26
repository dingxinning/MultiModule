package com.serializable;

import com.google.gson.Gson;
import com.serializable.entity.BaseRequest;
import com.serializable.entity.PostArgs;
import com.serializable.entity.UserInfo;

import java.util.Arrays;

/**
 * Created by Wuxiang on 2017/11/30.
 * 使用 谷歌的GSON进行序列化
 */
public class JsonSerializable {
    public static void main(String[] args) {
        PostArgs postArgs = new PostArgs();
        BaseRequest baseRequest = new BaseRequest();
        UserInfo userInfo = new UserInfo();
        userInfo.userId = "walker";

        baseRequest.action = "getAction";
        baseRequest.version = "1.1.1";
        baseRequest.userInfo = userInfo;
        postArgs.baseRequest = baseRequest;
        postArgs.newsId = "1000.1";
        postArgs.adds = Arrays.asList("1", "2", "3", "4", "5");

        // 序列化
        Gson gson = new Gson();
        String json = gson.toJson(postArgs);
        System.out.println(json);

        // 反序列化
        PostArgs postArgs1 = gson.fromJson(json, PostArgs.class);
        System.out.println(postArgs1);

        // 注意：不管实体类是多字段，还是少字段，都能反序列化成功
    }
}
