package org.assignment.iumtweb.iumtweb_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IumTwebSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(IumTwebSpringBootApplication.class, args);
		System.out.println("Server started. Connected to the database.");
	}

}
