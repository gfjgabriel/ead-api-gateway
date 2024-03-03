package com.ead.eadapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EadApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(EadApiGatewayApplication.class, args);
	}

}
