package com.example.demo.MyEmail;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication()
@MapperScan("com.example.demo.MyEmail.Mapper")
public class MyEmailApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyEmailApplication.class, args);
	}
}
