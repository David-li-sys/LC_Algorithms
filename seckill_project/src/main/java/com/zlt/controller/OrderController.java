package com.zlt.controller;

import com.zlt.domain.Order;
import com.zlt.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
@CrossOrigin
public class OrderController {
    @Autowired(required = false)
    OrderService orderService;

    @RequestMapping("/insertOrder")
    @ResponseBody
    public int insertOrder(Order order){
        return orderService.insertOrder(order);
    }
    @RequestMapping("/findOrderByUserId")
    @ResponseBody
    public List<Order> findOrderByUserId(Integer userId){
        return orderService.findOrderByUserId(userId);
    };
}
