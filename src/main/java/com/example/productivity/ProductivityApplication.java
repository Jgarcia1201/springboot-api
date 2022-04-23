package com.example.productivity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class ProductivityApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductivityApplication.class, args);
	}

}
