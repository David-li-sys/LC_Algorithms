package com.zlt.dao;

import com.zlt.domain.OrderDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderDetailMapper {
    public List<OrderDetail> findAllOrderDetail(Integer userId);
    public OrderDetail findOrderDetailById(String orderId);
}
