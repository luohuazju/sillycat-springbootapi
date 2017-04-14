package com.sillycat.springbootapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootAPIApplication {
	
	/**
	 * start tomcat and spring ENV
	 * 
	 * no applicationContext.xml and web.xml
	 * 
	 * 1. scan package and IOC the beans
	 * 2. scan @Bean
	 * 3. scan classpath third party Class and application.properties
	 * 4. @Configuration
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringBootAPIApplication.class, args);
	}

}
