package com.zlt.controller;


import com.zlt.domain.Good;
import com.zlt.domain.MiaoshaGood;
import com.zlt.service.MiaoshaGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.BoundHashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/miaoshaGood")
public class MiaoshaGoodsController {
    @Autowired
    MiaoshaGoodsService miaoshaGoodsService;

    @Autowired
    RedisTemplate redisTemplate;

    @GetMapping("/findAllMiaoshaGoods")
    @ResponseBody
    public List<Good> findAllMiaoshaGoods(){
        BoundHashOperations goods = redisTemplate.boundHashOps("goods");
        List<Good> values = goods.values();

        return values;
    }

    @GetMapping("/insertMiaoshaGood")
    @ResponseBody
    public String insertMiaoshaGood(MiaoshaGood miaoshaGood){
        miaoshaGoodsService.insertMiaoshaGood(miaoshaGood);
        return "成功";
    }
    @GetMapping("/deleteMiaoshaGood")
    @ResponseBody
    public String deleteMiaoshaGood(Integer goodId){
        miaoshaGoodsService.deleteMiaoshaGood(goodId);
        return "成功";
    }
}
