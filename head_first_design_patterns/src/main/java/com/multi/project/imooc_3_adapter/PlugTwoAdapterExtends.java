package com.multi.project.imooc_3_adapter;

/**
 * Created by Wuxiang on 2018/4/7
 *
 * 二相转三相的插座适配器
 *
 * 采用 ‘继承’ 方式的适配器称为 ‘类适配器’
 */
public class PlugTwoAdapterExtends extends PlugTwo implements PlugThree {

    @Override
    public void powerWithThree() {
        System.out.println("三相插头借助插座适配器，利用二相插座供电");
        this.powerWithTwo();
    }
}
