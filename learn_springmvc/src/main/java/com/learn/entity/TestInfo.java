package com.learn.entity;


import java.util.Date;

/**
 * Created by Wuxiang on 2017/3/26.
 */
public class TestInfo {
    private Long id;
    private String name;
    private Date birth;

    public TestInfo() {
    }

    public TestInfo(Long id, String name, Date birth) {
        this.id = id;
        this.name = name;
        this.birth = birth;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
}
