package com.example.demo.MyEmail.Service.Impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.example.demo.MyEmail.Mapper.UserInfoMapper;
import com.example.demo.MyEmail.Service.EmailTestService;

@Service("EmailTestService")
public class EmailTestServiceImpl implements EmailTestService{

	@Value("${spring.mail.username}")
	private String from;
	   
	@Autowired
	private JavaMailSender sender;
	
	@Resource
	UserInfoMapper userInfoMapper;
	
	/*
	@Scheduled(cron = "0 0/5 * * * ?")
	public void sendSimple() {
		 SimpleMailMessage message = new SimpleMailMessage();
		    message.setFrom(from); //发送者
		    message.setTo("2793425868@qq.com"); //接受者
		    message.setSubject("test"); //发送标题
		    message.setText("Hello!"); //发送内容
		    sender.send(message);
		    System.out.println("邮件发送成功");
	}
	*/
}
