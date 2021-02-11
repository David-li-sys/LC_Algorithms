package com.zlt.controller;

import com.zlt.domain.Business;
import com.zlt.domain.GoodVO;
import com.zlt.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/business")
@CrossOrigin
public class BusinessController {
    @Autowired(required = false)
    BusinessService businessService;
    @GetMapping("/findById")
    @ResponseBody
        public List<Business> findById(int id){
        List<Business> list= new ArrayList<Business>();
        list.add(businessService.findById(id));
            return list;
        }
    @GetMapping("/findAll")
    @ResponseBody
    public List<Business> findAll(){
        return businessService.findAll();
    }
    @GetMapping("/insert")
    public void insert(Business business){
        businessService.insert(business);
    }
    @GetMapping("/delete")
    public void delete(Integer id){
        if(id!=null){
        businessService.delete(id);}
        else {
            System.out.println("error");
        }

    }
    @GetMapping("/update")
    public void update(Business business){
        businessService.update(business);
    }
    @GetMapping("/findGoodByBusiness")
    public List<GoodVO> findGoodByBusiness(int id) {
        return businessService.findGoodByBusiness(id);
    }


}
