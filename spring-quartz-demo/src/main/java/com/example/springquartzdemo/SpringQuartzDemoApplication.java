package com.example.springquartzdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringQuartzDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringQuartzDemoApplication.class, args);
	}
}
