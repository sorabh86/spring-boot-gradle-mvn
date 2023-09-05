package com.example.mygradleapp;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;

@RestController
@SpringBootApplication
@ComponentScan(basePackages = "com.example.mygradleapp")
public class MyApplication {

	@RequestMapping("/")
	String home() {
		return "Hello World! from gradle build";
	}

	public static void main(String[] args) {
		SpringApplication.run(MyApplication.class, args);
	}

}