package com.multi.project.imooc_2_template;

/**
 * Created by Wuxiang on 2018/4/7

 * 具体子类，提供了制备茶的具体实现
 */
public class Tea extends RefreshBeverage {

    @Override
    protected void brew() {
        System.out.println("2.用80度的热水浸泡茶叶5分钟");
    }

    @Override
    protected void addCondiments() {
        System.out.println("4.加入柠檬");
    }

    /*
     * 子类通过覆盖的形式选择挂载钩子函数
     * @see com.multi.project.imooc_2_template.Test#isCustomerWantsCondiments()
     */
    @Override
    protected boolean isCustomerWantsCondiments(){
        return false;
    }

}
