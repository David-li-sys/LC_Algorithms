package com.zlt.service.impl;

import com.zlt.dao.UserMapper;
import com.zlt.domain.User;
import com.zlt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired(required = false)
    UserMapper userMapper;


    public List<User> findAllUser() {
        return userMapper.findAllUser();
    }

    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }

    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    public User findUserById(Integer userId) {
        return userMapper.findUserById(userId);
    }

    public int deleteUser(Integer userId) {
        return userMapper.deleteUser(userId);
    }

    public User getUserByName(String username) {
        return userMapper.getUserByName(username);
    }
}
