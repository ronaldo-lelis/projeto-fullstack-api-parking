package com.fullstack.api_parking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ApiParkingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiParkingApplication.class, args);
	}
	
	@GetMapping("/")
	public String index() {
		return "Olá Mundo!!!";
	}

}
