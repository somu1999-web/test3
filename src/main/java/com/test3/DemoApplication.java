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
		float a = 10.3f;  // dev_1
		SpringApplication.run(DemoApplication.class, args);
	}

}
