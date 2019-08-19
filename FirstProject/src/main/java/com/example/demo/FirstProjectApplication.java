package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(FirstProjectApplication.class, args);
		
		Employee e = context.getBean(Employee.class);
		e.test();
		
		/*
		 * Employee e1 = context.getBean(Employee.class); e1.test();
		 */
		
		
	}

}
