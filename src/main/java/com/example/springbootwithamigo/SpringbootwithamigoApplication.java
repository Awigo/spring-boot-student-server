package com.example.springbootwithamigo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootwithamigoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootwithamigoApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello() {
		return "Hello spring!";
	}

}
