package com.satya.devops.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class DevopsSampleApplication {
	@GetMapping("/message")
	public String getMessage() {
		return "Welcome to Java Techie"; 
	}

	public static void main(String[] args) {
		SpringApplication.run(DevopsSampleApplication.class, args);
	}

}
