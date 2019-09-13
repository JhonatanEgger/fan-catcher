package com.br.fancatcher.fancatcherconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class FanCatcherConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FanCatcherConfigServerApplication.class, args);
	}

}
