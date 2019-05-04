package com.example.demo.MyEmail.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.example.demo.MyEmail.Model.Persons;

public interface PersonsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Persons record);

    int insertSelective(Persons record);

    Persons selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Persons record);

    int updateByPrimaryKeyWithBLOBs(Persons record);

    int updateByPrimaryKey(Persons record);
    
    @Select("select * from persons")
    List<Persons> getAll();
}