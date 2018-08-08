package com.resttemplate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Wuxiang on 2017/8/31.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RestUser {

    private int id;
    private int age;
    private String name;
    private String address;
    private String hobay;

    public RestUser(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

}
