package com.multi.project.imooc_7_cor;

import com.multi.project.imooc_7_cor.handler.PriceHandler;
import com.multi.project.imooc_7_cor.handler.PriceHandlerFactory;

import java.util.Random;

/**
 * Created by Wuxiang on 2018/4/8
 *
 * 客户，请求折扣
 *
 * 责任链模式
 * 示例：有求必应的销售团队
 * Sales --> Manager --> Director --> VicePresident --> CEO
 *
 * 好处：
 * 1. 低耦合
 * 客户端（Customer），不关注具体是链中的哪个节点处理了请求（不依赖具体的处理请求的实体）
 *
 * 2. 可扩展
 * 增加一个 Lead 进入链中，只需要增加 Lead实体类，继承PriceHandler，实现具体业务代码
 * 并修改对应的工厂方法即可
 *
 * 缺点：
 * 1. 性能差
 *
 */
public class Customer {

    private PriceHandler priceHandler;

    public void setPriceHandler(PriceHandler priceHandler) {
        this.priceHandler = priceHandler;
    }

    public void requestDiscount(float discount) {
        priceHandler.processDiscount(discount);
    }


    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setPriceHandler(PriceHandlerFactory.createPriceHandler());

        Random rand = new Random();

        for (int i = 1; i <= 100; i++) {
            System.out.print(i + ":");
            customer.requestDiscount(rand.nextFloat());
        }


    }
}
