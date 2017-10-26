package com.ultrapower.atp.atp.eureka.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AtpMicrosoftEurekaCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtpMicrosoftEurekaCenterApplication.class, args);
	}
}
