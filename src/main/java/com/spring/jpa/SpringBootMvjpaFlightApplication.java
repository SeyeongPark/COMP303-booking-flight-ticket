package com.spring.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMvjpaFlightApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMvjpaFlightApplication.class, args);
		System.out.println("Spring Boot MVC JPA app is ready...");
	}
}
