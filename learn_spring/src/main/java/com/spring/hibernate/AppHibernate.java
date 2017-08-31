package com.spring.hibernate;

import com.spring.hibernate.entity.Stock;
import com.spring.hibernate.service.StockService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Wuxiang on 2017/4/6.
 */
public class AppHibernate {
    public static void main(String[] args) {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("config/MyHibernate.xml");
        StockService stockBo = (StockService)context.getBean("stockBo");

        /** insert **/
        Stock stock = new Stock();
        stock.setStockCode("7668");
        stock.setStockName("HAIO");
        stockBo.save(stock);

        /** select **/
        Stock stock2 = stockBo.findByStockCode("7668");
        System.out.println(stock2);

        /** update **/
        stock2.setStockName("HAIO-1");
        stockBo.update(stock2);

        /** delete **/
        stockBo.delete(stock2);

        System.out.println("Done");
    }
}
