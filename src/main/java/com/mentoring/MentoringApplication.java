package com.mentoring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class MentoringApplication {

	public static void main(String[] args) {
		SpringApplication.run(MentoringApplication.class, args);
	}

}
