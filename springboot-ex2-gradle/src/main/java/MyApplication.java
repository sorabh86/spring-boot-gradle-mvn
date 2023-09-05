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
		return "<h1>Hello World!</h1><p>Greeting from gradle build</p>"+
		"<p>Welcome Aboard, we are prepared</p>";
	}

	public static void main(String[] args) {
		SpringApplication.run(MyApplication.class, args);
	}

}