package com.zlt.dao;

import com.zlt.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    public List<User> findAllUser();
    public int insertUser(User user);
    public int updateUser(User user);
    public User findUserById(Integer userId);
    public int deleteUser(Integer userId);
    public User getUserByName(String username);
}
