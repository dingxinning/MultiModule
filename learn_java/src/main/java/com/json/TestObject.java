package com.json;

import lombok.Data;

import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by Wuxiang on 2017/9/1.
 */
@Data
public class TestObject {
    private String Name;
    private int Age;
    private Timestamp Time;
    private Date CurrentDate;
}
