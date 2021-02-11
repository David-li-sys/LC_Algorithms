package com.zlt.service;

import com.zlt.domain.BusinessUser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BusinessUserService {

    List<BusinessUser> findAllBusinessUser();
    int insertUser(BusinessUser businessUserser);
    int updateUser(BusinessUser businessUserser);
    BusinessUser findBusinessUserById(Integer userId);
    int deleteUser(Integer userId);

}
