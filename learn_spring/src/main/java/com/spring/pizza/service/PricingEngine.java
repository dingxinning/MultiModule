package com.spring.pizza.service;

import com.spring.pizza.domain.Order;

public interface PricingEngine {
  public float calculateOrderTotal(Order order);
}
