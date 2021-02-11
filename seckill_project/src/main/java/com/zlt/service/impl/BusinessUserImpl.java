package com.zlt.service.impl;

import com.zlt.dao.BusinessUserMapper;
import com.zlt.domain.BusinessUser;
import com.zlt.service.BusinessUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusinessUserImpl implements BusinessUserService {

    @Autowired(required = false)
    BusinessUserMapper businessUserMapper;

    public List<BusinessUser> findAllBusinessUser() {
        return businessUserMapper.findAllBusinessUser();
    }

    public int insertUser(BusinessUser businessUser) {
        return businessUserMapper.insertUser(businessUser);
    }

    public int updateUser(BusinessUser businessUser) {
        return businessUserMapper.updateUser(businessUser);
    }

    public BusinessUser findBusinessUserById(Integer userId) {
        return businessUserMapper.findUserById(userId);
    }

    public int deleteUser(Integer userId) {
        return businessUserMapper.deleteUser(userId);
    }
}
