package com.epicode.spring_81;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring81Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring81Application.class, args);
		System.out.println("Service running... port 8081");
	}

}
