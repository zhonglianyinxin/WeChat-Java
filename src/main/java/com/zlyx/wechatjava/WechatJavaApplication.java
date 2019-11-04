package com.zlyx.wechatjava;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zlyx.wechatjava.mapper")
public class WechatJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(WechatJavaApplication.class, args);
	}

}
