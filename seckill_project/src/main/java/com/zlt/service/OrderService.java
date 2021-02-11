package com.zlt.service;

import com.zlt.domain.Order;

import java.util.List;

public interface OrderService {
    public int insertOrder(Order order);
    public List<Order> findOrderByUserId(Integer userId);
}
