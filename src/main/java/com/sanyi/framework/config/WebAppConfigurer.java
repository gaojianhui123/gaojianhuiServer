package com.sanyi.framework.config;

import java.io.File;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration

public class WebAppConfigurer extends WebMvcConfigurerAdapter {
	@Value("${assets.piclocation}")
    private String picLocation;
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        File directory = new File(System.getProperty("user.dir") + File.separator + picLocation);
        String path2 = directory.getAbsolutePath();
        StringBuilder builder = new StringBuilder();
        builder.append("file:").append(path2).append("/");
        registry.addResourceHandler("/"+picLocation+"**").addResourceLocations(builder.toString());
        
       
        super.addResourceHandlers(registry);
    }
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
        			.allowedOrigins("*")
                .allowCredentials(true)
                .allowedHeaders("*")
                .allowedMethods("*")
                .maxAge(CrossOrigin.DEFAULT_MAX_AGE);
    }

}
