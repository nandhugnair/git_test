package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	public static void main(final String[] args) {
		final ConfigurableApplicationContext configurableApplicationContext = SpringApplication
				.run(SpringMain.class, args);
		
		 
	}
	
 
}
