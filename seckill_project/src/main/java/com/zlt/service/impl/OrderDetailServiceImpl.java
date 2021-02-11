package com.zlt.service.impl;

import com.zlt.dao.OrderDetailMapper;
import com.zlt.dao.OrderMapper;
import com.zlt.domain.OrderDetail;
import com.zlt.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderDetailServiceImpl implements OrderDetailService {
    @Autowired(required = false)
    OrderDetailMapper orderDetailMapper;

    @Override
    public List<OrderDetail> findAllOrderDetail(Integer userId) {
        return orderDetailMapper.findAllOrderDetail(userId);
    }

    @Override
    public OrderDetail findOrderDetailById(String orderId) {
        return orderDetailMapper.findOrderDetailById(orderId);
    }
}
