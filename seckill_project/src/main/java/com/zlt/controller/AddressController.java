package com.zlt.controller;

import com.zlt.domain.Address;
import com.zlt.domain.Good;
import com.zlt.domain.Order;
import com.zlt.service.AddressService;
import com.zlt.service.GoodService;
import com.zlt.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.UUID;

@RestController
@RequestMapping("/address")
@CrossOrigin
public class AddressController {
    @Autowired(required = false)
    AddressService addressService;
    @Autowired(required = false)
    GoodService goodService;
    @Autowired(required = false)
    OrderService orderService;

    @RequestMapping("/insertAddress")
    @ResponseBody
    public String insertAddress(Address address,Integer userId,Integer goodsId){
        String addressid = UUID.randomUUID().toString();
        String orderid = UUID.randomUUID().toString();
        address.setAddressId(addressid);
        addressService.insertAddress(address);
        Good good = goodService.findGoodById(goodsId);
        Order order=new Order();
        order.setOrderId(orderid);
        order.setUserId(userId);
        order.setGoodsId(goodsId);
        order.setAddressId(addressid);
        order.setPayPrice(good.getGoodsPrice());
        order.setOrderStatus(0);
        order.setCreateTime(new Date());
        order.setPayTime(new Date());
        orderService.insertOrder(order);
        return orderid;
    }
}
