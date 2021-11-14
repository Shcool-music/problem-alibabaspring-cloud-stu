package com.problem.contentcenter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@MapperScan("com.problem")
public class ContentCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContentCenterApplication.class, args);
	}


	//在spring 容器中创建一个对象，RestTemplate ；名称/ID是方法名
	//=<bean id = "xxx" class="xxx.RestTemplate">
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
