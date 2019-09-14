package com.br.fancatcher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CampanhaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CampanhaServiceApplication.class, args);
	}

}
