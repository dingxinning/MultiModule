package com.resttemplate.entity;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import common.util.CustomDateSerializer;
import common.util.CustomJsonDateDeserializer;

import java.util.Date;

/**
 * Created by Wuxiang on 2018/5/31
 */
@Data
public class Response {

    private String userId;

    private String oneCode;

    @JsonSerialize(using = CustomDateSerializer.class)
    @JsonDeserialize(using = CustomJsonDateDeserializer.class)
    private Date responseDate;

    @JsonSerialize(using = CustomDateSerializer.class)
    @JsonDeserialize(using = CustomJsonDateDeserializer.class)
    private Date requestDate;
}
