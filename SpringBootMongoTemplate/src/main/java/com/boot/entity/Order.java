package com.boot.entity;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Wuxiang on 2017/9/2.
 */
@Document(collection = "order")
public class Order {
    private String name;
    private String out;
    private String in;

    public Order() {
    }

    public Order( String name, String out, String in) {
        this.name = name;
        this.out = out;
        this.in = in;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOut() {
        return out;
    }

    public void setOut(String out) {
        this.out = out;
    }

    public String getIn() {
        return in;
    }

    public void setIn(String in) {
        this.in = in;
    }
}
