package com.zlt.service;

import com.zlt.domain.OrderDetail;

import java.util.List;

public interface OrderDetailService {
    public List<OrderDetail> findAllOrderDetail(Integer userId);
    public OrderDetail findOrderDetailById(String orderId);
}
