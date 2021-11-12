package com.jpmc.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableAutoConfiguration
@Configuration
@EnableWebMvc
@ComponentScan({"com.jpmc.*"})
public class DemoRestSpringPracticeprojectNewApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoRestSpringPracticeprojectNewApplication.class, args);
	}

}
