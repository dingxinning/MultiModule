package com.resttemplate;

import lombok.Data;

import java.util.Date;

/**
 * Created by Wuxiang on 2018/5/31
 */
@Data
public class Response {

    private String userId;

    private String oneCode;

    private Date responseDate;

    private Date requestDate;
}
