package com.exam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  // this includes @ComponentScan, @Configuration, and @EnableAutoConfiguration
public class ExamserverApplication {
	public static void main(String[] args) {
		SpringApplication.run(ExamserverApplication.class, args);
	}
}
