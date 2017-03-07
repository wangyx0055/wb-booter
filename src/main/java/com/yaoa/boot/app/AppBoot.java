package com.yaoa.boot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description 应用启动类
 * @author cjh
 * @version 1.0
 * @date：2017年2月15日 下午6:22:28
 */
@ImportAutoConfiguration
@SpringBootApplication
public class AppBoot {
	
	public static void main(String[] args) {
		SpringApplication.run(AppBoot.class, args);
	}

}