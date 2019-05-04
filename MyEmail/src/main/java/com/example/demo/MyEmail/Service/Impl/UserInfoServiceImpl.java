package com.example.demo.MyEmail.Service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.demo.MyEmail.Mapper.UserInfoMapper;
import com.example.demo.MyEmail.Mapper.PersonsMapper;
import com.example.demo.MyEmail.Mapper.StudentMapper;
import com.example.demo.MyEmail.Model.Persons;
import com.example.demo.MyEmail.Model.Student;
import com.example.demo.MyEmail.Model.UserInfo;
import com.example.demo.MyEmail.Service.UserInfoService;

@Service("UserInfoService")
public class UserInfoServiceImpl implements UserInfoService{

	@Resource
	UserInfoMapper userInfoMapper;
	
	@Resource
	PersonsMapper personsMapper;
	
	@Resource
	StudentMapper studentMapper;
	
	@Override
	public List<UserInfo> getUserInfoData() {
		return userInfoMapper.selectAll();
	}

	@Override
	public String getStr(Long type) {
		return userInfoMapper.getStr(type);
	}

	@Override
	public List<Persons> getPersonsData() {
		return personsMapper.getAll();
	}

	@Override
	public List<Student> getStudentData() {
		return studentMapper.getAll();
	}

	@Override
	public int SaveStudentData(Student data) {
		return studentMapper.insert(data);
		}
}
