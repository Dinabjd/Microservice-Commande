package com.example.MicroServiceCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MicroServiceCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceCloudApplication.class, args);
	}

}
