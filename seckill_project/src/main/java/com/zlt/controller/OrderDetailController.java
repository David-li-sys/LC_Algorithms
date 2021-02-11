package com.zlt.controller;


import com.zlt.domain.OrderDetail;
import com.zlt.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orderDetail")
@CrossOrigin
public class OrderDetailController {
    @Autowired(required = false)
    OrderDetailService orderDetailService;

    @RequestMapping("/findAllOrderDetail")
    @ResponseBody
    public List<OrderDetail> findAllOrderDetail(Integer userId){
        return orderDetailService.findAllOrderDetail(userId);
    };

    @RequestMapping("/findOrderDetailById")
    @ResponseBody
    public OrderDetail findOrderDetailById(String orderId){
        return  orderDetailService.findOrderDetailById(orderId);
    };
}
