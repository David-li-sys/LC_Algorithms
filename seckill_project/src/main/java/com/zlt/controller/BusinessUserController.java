package com.zlt.controller;

import com.zlt.dao.BusinessUserMapper;
import com.zlt.domain.BusinessUser;
import com.zlt.service.BusinessUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

    @RestController
    @CrossOrigin
    public class BusinessUserController {

        @Autowired
        BusinessUserService businessUserService;

        @Autowired(required = false)
        BusinessUserMapper businessUserMapper;

        @GetMapping("/fibAllUser")
        @ResponseBody
        public List<BusinessUser> findAll() {
            List<BusinessUser> businessUsers = businessUserService.findAllBusinessUser();
            return businessUsers;
        }

        @GetMapping("/inbUser")
        @ResponseBody
        public String insertUser(BusinessUser businessUser) {
            businessUserService.insertUser(businessUser);
            return "添加成功";
        }

        @GetMapping("/upbUser")
        @ResponseBody
        public String updateUser(BusinessUser businessUser) {
            businessUserService.updateUser(businessUser);
            return "更新成功";
        }

        @GetMapping("/sebUserById")
        @ResponseBody
        public BusinessUser selectUserById(Integer userId) {
            return businessUserService.findBusinessUserById(userId);
        }

        @GetMapping("/debUser")
        @ResponseBody
        public String deleteUser(Integer userId) {
            businessUserService.deleteUser(userId);
            return "删除成功";
        }
    }
