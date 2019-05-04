package com.example.demo.MyEmail.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import com.example.demo.MyEmail.Model.Student;

public interface StudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
    
    @Select("select * from student")
    List<Student> getAll();
}