package com.myspringboot.microservice.eureka.naming.server.springbootmicroserviceeurekanamingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringbootMicroserviceEurekanamingserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMicroserviceEurekanamingserverApplication.class, args);
	}
}
