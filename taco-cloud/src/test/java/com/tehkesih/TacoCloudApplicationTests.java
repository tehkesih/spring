package com.tehkesih;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootTest
class TacoCloudApplicationTests implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(TacoCloudApplicationTests.class, args);
	}
	
	@Override
	public void addViewControllers (ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("home");
	}
	
	@Test
	void contextLoads() {
	}

}
