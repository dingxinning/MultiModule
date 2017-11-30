package com.serializable.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by Wuxiang on 2017/11/30.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostArgs {
    public BaseRequest baseRequest;

    public String newsId;

    public List<String> adds;
}
