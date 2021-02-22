package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;

@SpringBootApplication
public class SpringdemoApplication {

	public static void main(String[] args) {
		System.out.println("Hello");
		SpringApplication.run(SpringdemoApplication.class, args);

	}


}
