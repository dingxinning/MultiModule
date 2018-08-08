package com.resttemplate.entity;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import common.util.CustomDateSerializer;
import common.util.CustomJsonDateDeserializer;

import java.util.Date;

/**
 * Created by Wuxiang on 2018/5/31
 */
public class Response {

    private String userId;

    private String oneCode;

    @JsonSerialize(using = CustomDateSerializer.class)
    @JsonDeserialize(using = CustomJsonDateDeserializer.class)
    private Date responseDate;

    @JsonSerialize(using = CustomDateSerializer.class)
    @JsonDeserialize(using = CustomJsonDateDeserializer.class)
    private Date requestDate;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOneCode() {
        return oneCode;
    }

    public void setOneCode(String oneCode) {
        this.oneCode = oneCode;
    }

    public Date getResponseDate() {
        return responseDate;
    }

    public void setResponseDate(Date responseDate) {
        this.responseDate = responseDate;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    @Override
    public String toString() {
        return "Response{" +
                "userId='" + userId + '\'' +
                ", oneCode='" + oneCode + '\'' +
                ", responseDate=" + responseDate +
                ", requestDate=" + requestDate +
                '}';
    }
}
