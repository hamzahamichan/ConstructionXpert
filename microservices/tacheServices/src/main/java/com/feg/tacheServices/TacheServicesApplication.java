package com.feg.tacheServices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class TacheServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(TacheServicesApplication.class, args);
	}

}
