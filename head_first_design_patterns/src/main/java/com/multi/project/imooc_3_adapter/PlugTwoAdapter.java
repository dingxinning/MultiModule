package com.multi.project.imooc_3_adapter;

/**
 * Created by Wuxiang on 2018/4/7
 *
 * 二相转三相的插座适配器
 *
 * 采用 ‘组合’ 方式的适配器称为 ‘对象适配器’
 */
public class PlugTwoAdapter implements PlugThree {

    private PlugTwo plug;

    public PlugTwoAdapter(PlugTwo plug){
        this.plug = plug;
    }

    @Override
    public void powerWithThree() {
        System.out.println("三相插头借助插座适配器，利用二相插座供电");
        plug.powerWithTwo();
    }

}
