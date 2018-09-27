package com.windmagics.ssmdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

//@ComponentScan("com.windmagics.ssmdemo.controller")
//@ComponentScan(basePackages = {"com.windmagics.ssmdemo.service","com.windmagics.ssmdemo.service.impl"})
//@MapperScan("com.windmagics.ssmdemo.dao")

public class SsmdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SsmdemoApplication.class, args);
	}
}
