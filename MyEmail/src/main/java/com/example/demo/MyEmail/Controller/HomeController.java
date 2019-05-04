package com.example.demo.MyEmail.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.MyEmail.Mapper.UserInfoMapper;
import com.example.demo.MyEmail.Model.UserInfo;
import com.example.demo.MyEmail.Model.Persons;
import com.example.demo.MyEmail.Model.Student;
import com.example.demo.MyEmail.Service.UserInfoService;;

@RestController	
public class HomeController {

	@Autowired
	private UserInfoMapper userMapper;
	
	@Autowired
	private UserInfoService  userInfoService;
 
	@RequestMapping("getUsers")
	public List<UserInfo> getUsers() {
		List<UserInfo> users = userMapper.getAll();
		return users;
	}
	
	@RequestMapping("getPersons")
	public List<Persons> getPersons() {
		List<Persons> users = userInfoService.getPersonsData();
		return users;
	}
	
	@CrossOrigin
    @RequestMapping(value="/test",method = RequestMethod.GET, produces = "application/json;charset=UTF-8" )
	public String test() {
		System.out.println("success!");
		return "Hello World!";
	}
	
	@CrossOrigin
    @RequestMapping(value="/Student",method = RequestMethod.GET, produces = "application/json;charset=UTF-8" )
	public List<Student> getStudent() {
		List<Student> users = userInfoService.getStudentData();
		return users;
	}
	
	@CrossOrigin
    @RequestMapping(value="/Student",method = RequestMethod.POST, produces = "application/json;charset=UTF-8" )
    @ResponseBody
	public int saveStudent(@RequestBody Student data) {
		System.out.println(data.getCourse());
		return userInfoService.SaveStudentData(data);
	}
	
	@CrossOrigin
    @RequestMapping(value="/login",method = RequestMethod.POST, produces = "application/json;charset=UTF-8" )
    @ResponseBody
    public int userlogin(@RequestBody JSONObject user) {
		System.out.println("name: " + user.get("name"));
		System.out.println("password: " +  user.get("password"));
		String name = (String) user.get("name");
		String password = (String) user.get("password");
    	if(name.equals("zzc") && password.equals("zzc19961217")){  		
			return 400;
		}else{
			return 504;
		}
    }

}
