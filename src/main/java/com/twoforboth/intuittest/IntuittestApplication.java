package com.twoforboth.intuittest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.twoforboth.*")
public class IntuittestApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntuittestApplication.class, args);
	}
}
