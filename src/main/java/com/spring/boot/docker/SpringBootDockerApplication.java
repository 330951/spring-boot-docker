package com.spring.boot.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerApplication.class, args);
	}

	@GetMapping("/springBootDocker")
	public String getString() {
		System.out.println("This is from the SpringBootDockerApplication");

		return "This is from the SpringBootDockerApplication ";
	}
}
