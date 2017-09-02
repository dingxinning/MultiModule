package com.boot.dao;

import com.boot.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

/**
 * Created by Wuxiang on 2017/9/2.
 */
@Component
public class OrderDao {
    @Autowired
    MongoTemplate mongoTemplate;

    public void addOrder(Order order) {
        mongoTemplate.save(order);
    }
}
