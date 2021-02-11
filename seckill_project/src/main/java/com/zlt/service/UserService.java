package com.zlt.service;

import com.zlt.domain.User;

import java.util.List;

public interface UserService {
    public List<User> findAllUser();
    public int insertUser(User user);
    public int updateUser(User user);
    public User findUserById(Integer id);
    public int deleteUser(Integer id);
    public User getUserByName(String username);
}
