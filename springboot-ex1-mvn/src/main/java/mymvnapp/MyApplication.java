package mymvnapp;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;

@RestController
@SpringBootApplication
@ComponentScan(basePackages = "mymvnapp")
public class MyApplication {

	@RequestMapping("/")
	String home() {
		return "<h1>Hello World!, </h1><p>Greetings from Maven</p>"+
		"<p>We are trying to implements dev tools.</p>";
	}

	public static void main(String[] args) {
		SpringApplication.run(MyApplication.class, args);
	}

}