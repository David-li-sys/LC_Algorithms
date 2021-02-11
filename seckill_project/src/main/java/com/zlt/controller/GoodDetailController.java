package com.zlt.controller;

import com.zlt.domain.GoodDetail;
import com.zlt.service.GoodDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/goodDetail")
public class GoodDetailController {
    @Autowired(required = false)
    GoodDetailService goodDetailService;
    @RequestMapping("/getGoodDetailById")
    @ResponseBody
    public GoodDetail getGoodDetail(Integer miaoshaGoodsId){
        return goodDetailService.getGoodDetail(miaoshaGoodsId);
    }
}
