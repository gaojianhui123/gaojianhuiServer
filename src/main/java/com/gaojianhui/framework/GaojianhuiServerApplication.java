package com.gaojianhui.framework;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.boot.SpringApplication;
import org.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages= {"com.gaojianhui.framework.mapper"})
@EntityScan(basePackages={"com.gaojianhui.framework.model"})
@EnableJpaRepositories(basePackages = {"com.gaojianhui.framework.dao"})
//@EnableCaching
@ServletComponentScan
public class GaojianhuiServerApplication {
	@Bean
	RestTemplate restTemplate() {
		RestTemplate rest = new RestTemplate();
//		rest.getMessageConverters().add(new WxMappingJackson2HttpMessageConverter());
		return rest;
	}
	public static void main(String[] args) {
		SpringApplication.run(GaojianhuiServerApplication.class, args);
	}
}
