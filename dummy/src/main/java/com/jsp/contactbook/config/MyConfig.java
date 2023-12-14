package com.jsp.contactbook.config;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.jsp.contactbook")
public class MyConfig {
     @Bean
	public EntityManagerFactory entityManagerFactory() {
		return Persistence.createEntityManagerFactory("chethan");
	}
}
