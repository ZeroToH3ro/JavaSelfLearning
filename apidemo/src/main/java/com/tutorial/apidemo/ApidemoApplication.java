package com.tutorial.apidemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApidemoApplication {
	//! THIS IS APPLICATION CONTEXT
	public static void main(String[] args) {
		//! SpringApplication.run(): return a object ApplicationContext interface, will represent IoC container.
		SpringApplication.run(ApidemoApplication.class, args);
	}
}


