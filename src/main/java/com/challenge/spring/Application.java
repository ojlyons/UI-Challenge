/*
The main file for Spring Boot logic
 */


package com.challenge.spring;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	// At localhost:8080/hello, it will print Hello World (unless ?name= specifies something else)
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

}
            