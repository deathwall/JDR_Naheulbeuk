package com.forfun.jdr.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.forfun.jdr.*"})
public class JdrNaheulbeukApplication {

	public static void main(String[] args) {
		SpringApplication.run(JdrNaheulbeukApplication.class, args);
	}
}
