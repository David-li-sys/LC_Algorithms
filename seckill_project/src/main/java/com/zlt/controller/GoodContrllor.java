package com.zlt.controller;


import com.zlt.domain.Good;
import com.zlt.domain.User;
import com.zlt.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/good")
@CrossOrigin
public class GoodContrllor {
    @Autowired
    GoodService goodService;

    @GetMapping("/findAllGoods")
    @ResponseBody
    public List<Good> findAllGoods(){
        return goodService.findAll();
    }
    @GetMapping("/findGoodsById")
    public List<Good> findGoodById(Integer goodId){
        Good good= goodService.findGoodById(goodId);
        List list =new ArrayList();
        list.add(good);
        return list;
    }
    @GetMapping("/deleteGoodById")
    @ResponseBody
    public String deleteGood(Integer goodId){
        goodService.deleteGood(goodId);
        return "成功";
    }

    @GetMapping("/insertGood")
    @ResponseBody
    public String insertGood(Good good){
        goodService.insertGood(good);
        return "成功";
    }

    @GetMapping("/updateGood")
    @ResponseBody
    public String updateGood(Good good){
        goodService.updateGood(good);
        return "成功";
    }

    @GetMapping("/findSomeGoods")
    @ResponseBody
    public List<Good> findSomeGoods(Integer start,Integer step){
        return goodService.findSomeGoods(start,step);
    }
}
