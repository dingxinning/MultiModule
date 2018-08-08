package com.resttemplate.entity;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import common.util.CustomDateSerializer;
import common.util.CustomJsonDateDeserializer;

import java.util.Date;
import java.util.List;

/**
 * Created by Wuxiang on 2018/5/31
 */
public class Request {
    private String userId;

    @JsonSerialize(using = CustomDateSerializer.class)
    @JsonDeserialize(using = CustomJsonDateDeserializer.class)
    private Date requestDate;

    private List<String> code;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public List<String> getCode() {
        return code;
    }

    public void setCode(List<String> code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Request{" +
                "userId='" + userId + '\'' +
                ", requestDate=" + requestDate +
                ", code=" + code +
                '}';
    }
}
