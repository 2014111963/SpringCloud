package com.example.demo.MyEmail.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.MyEmail.Mapper.UserMapper;
import com.example.demo.MyEmail.Model.Util.User;

/**
 * @author jinbin
 * @date 2018-07-08 20:52
 */
@Service("UserService")
public class UserService {
    @Autowired
    UserMapper userMapper;
    public User findByUsername(User user){
        return userMapper.findByUsername(user.getUsername());
    }
    public User findUserById(String userId) {
        return userMapper.findUserById(userId);
    }

}