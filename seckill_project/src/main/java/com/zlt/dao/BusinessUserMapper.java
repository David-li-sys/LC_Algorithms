package com.zlt.dao;

import com.zlt.domain.BusinessUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BusinessUserMapper {
    List<BusinessUser> findAllBusinessUser();
    int insertUser(BusinessUser businessUser);
    int updateUser(BusinessUser businessUser);
    BusinessUser findUserById(Integer userId);
    int deleteUser(Integer userId);
    BusinessUser getUserByName(String username);
}
