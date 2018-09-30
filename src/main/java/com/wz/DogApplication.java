package com.wz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication()
public class DogApplication {

	public static void main(String[] args) {
		SpringApplication.run(DogApplication.class, args);
	}



}
