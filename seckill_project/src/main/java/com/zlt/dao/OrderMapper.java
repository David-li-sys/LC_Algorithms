package com.zlt.dao;

import com.zlt.domain.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {
    public int insertOrder(Order order);
    public List<Order> findOrderByUserId(Integer userId);
}
