package com.serializable.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Wuxiang on 2017/11/30.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseRequest {
    public String action;

    public String version;

    public UserInfo userInfo;
}
