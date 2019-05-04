package com.example.demo.MyEmail.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.demo.MyEmail.Model.UserInfo;

public interface UserInfoMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    List<UserInfo> selectAll();
    
    @Select("select * from myapp_label")
    List<UserInfo> getAll();

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
    
    @Select("call proc_adder(#{type})")
    String getStr(@Param("type") Long type);
}