package com.izzy.imageservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ImageserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImageserviceApplication.class, args);
	}

	@GetMapping("/")
	public String izzy() {
		return "hello izzy";
	}
}
