package com.example.demo.MyEmail.Service;

import java.util.List;

import com.example.demo.MyEmail.Model.UserInfo;
import com.example.demo.MyEmail.Model.Persons;
import com.example.demo.MyEmail.Model.Student;;

public interface UserInfoService {

	public List<UserInfo> getUserInfoData();
	
	public List<Persons> getPersonsData();
	
	public List<Student> getStudentData();
	
	public int SaveStudentData(Student data);
	
	public String getStr(Long type);
	
}
