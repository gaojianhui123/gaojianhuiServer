package com.sanyi.framework;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@MapperScan("com.sanyi.framework.dtomapper")
@SpringBootApplication
public class liuzhiServerApplication {
	@Bean
	RestTemplate restTemplate() {
		RestTemplate rest = new RestTemplate();
		rest.getMessageConverters().add(new WxMappingJackson2HttpMessageConverter());
		return rest;
	}
	public static void main(String[] args) {
		SpringApplication.run(liuzhiServerApplication.class, args);
	}
}
