package com.test3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		String name = "test";
		int x = 100;
		boolean isPresent = false;
		char y = 'a';
		SpringApplication.run(DemoApplication.class, args);
	}

}
