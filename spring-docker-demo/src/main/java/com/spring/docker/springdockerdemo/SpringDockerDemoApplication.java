package com.spring.docker.springdockerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDockerDemoApplication {

	@GetMapping("/message")
	public String getMessage() {
		return "This is a docker zone!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDockerDemoApplication.class, args);
	}

}
