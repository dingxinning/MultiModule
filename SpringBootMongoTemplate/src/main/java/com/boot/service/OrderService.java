package com.boot.service;

import com.boot.dao.OrderDao;
import com.boot.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Wuxiang on 2017/9/2.
 */
@Service
public class OrderService {

    @Autowired
    OrderDao orderDao;

    public void addOrder() {
        Order order = new Order();
        order.setName("苹果");
        order.setIn("4544");
        order.setOut("12223");
        orderDao.addOrder(order);

    }
}
