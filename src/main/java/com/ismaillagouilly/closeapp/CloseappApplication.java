package com.ismaillagouilly.closeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class CloseappApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloseappApplication.class, args);
	}

}
