package com.example.demo.MyEmail.Mapper;

import org.apache.ibatis.annotations.Param;

import com.example.demo.MyEmail.Model.Util.User;

/**
 * @author jinbin
 * @date 2018-07-08 20:44
 */
public interface UserMapper {
    User findByUsername(@Param("username") String username);
    User findUserById(@Param("Id") String Id);
}