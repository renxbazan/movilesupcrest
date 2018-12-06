package com.upc.moviles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class MovilesApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(MovilesApplication.class, args);
	}
}
