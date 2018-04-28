package com.javatechie.spring.insurance.server.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class InsuranceConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(InsuranceConfigServerApplication.class, args);
	}
}
