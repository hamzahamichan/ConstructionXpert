package com.feg.xprojetService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class XprojetServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(XprojetServiceApplication.class, args);
	}

}
