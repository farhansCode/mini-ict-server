package com.ICT.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		System.out.println("Starting ICT Server...");

		SpringApplication.run(ServerApplication.class, args);

		System.out.println("ICT Server started successfully");
	}
}