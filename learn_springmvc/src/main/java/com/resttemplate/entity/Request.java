package com.resttemplate.entity;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import common.util.CustomDateSerializer;
import common.util.CustomJsonDateDeserializer;

import java.util.Date;
import java.util.List;

/**
 * Created by Wuxiang on 2018/5/31
 */
@Data
public class Request {
    private String userId;

    @JsonSerialize(using = CustomDateSerializer.class)
    @JsonDeserialize(using = CustomJsonDateDeserializer.class)
    private Date requestDate;

    private List<String> code;
}
