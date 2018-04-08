package com.multi.project.imooc_7_cor.handler;

/**
 * Created by Wuxiang on 2018/4/8
 *
 * 销售， 可以批准5%以内的折扣
 */
public class Sales extends PriceHandler {

    @Override
    public void processDiscount(float discount) {
        if(discount <= 0.05){
            System.out.format("%s批准了折扣：%.2f%n", this.getClass().getSimpleName(), discount);
        }else{
            successor.processDiscount(discount);
        }

    }

}
