package com.multi.project.imooc_7_cor.handler;

/**
 * Created by Wuxiang on 2018/4/8
 *
 * 价格处理人，负责处理客户折扣申请
 */
public abstract class PriceHandler {

    /*
     * 直接后继，用于传递请求
     */
    protected PriceHandler successor;

    public void setSuccessor(PriceHandler successor) {
        this.successor = successor;
    }

    /*
     * 处理折扣申请
     */
    public abstract  void processDiscount(float discount);

}
