package com.example.demo.MyEmail.Controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.MyEmail.Model.UserInfo;
import com.example.demo.MyEmail.Service.UserInfoService;

@RestController	
public class EmailControllerf {

	@Resource
	UserInfoService userInfoService;
	

	@RequestMapping("getUserInfoData")
	public List<UserInfo> getUserInfoData() {
		return userInfoService.getUserInfoData();
	}
	
	@RequestMapping("getString")
	public String getString(@RequestBody UserInfo record) {
		return userInfoService.getStr(record.getId());
	}
}
