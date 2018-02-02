package com.test;

import lombok.Data;

/**
 * Created by Wuxiang on 2018/2/2
 */
@Data
public class CopyEntity implements Cloneable{
    private String aaa;
    private String bbb;

    public Object clone()
    {
        Object o=null;
        try
        {
            o=super.clone();//Object中的clone()识别出你要复制的是哪一个对象。
        }
        catch(CloneNotSupportedException e)
        {
            System.out.println(e.toString());
        }
        return o;
    }
}
