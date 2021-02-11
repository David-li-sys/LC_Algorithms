package com.zlt.service.impl;

import com.zlt.dao.OrderMapper;
import com.zlt.domain.Order;
import com.zlt.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired(required = false)
    OrderMapper orderMapper;
    @Override
    public int insertOrder(Order order) {
        return orderMapper.insertOrder(order);
    }

    @Override
    public List<Order> findOrderByUserId(Integer userId) {
        return orderMapper.findOrderByUserId(userId);
    }
}
