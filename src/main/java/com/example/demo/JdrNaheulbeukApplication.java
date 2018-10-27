package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.forfun.jdr.naheulbeuk.controller.IndexController;

@SpringBootApplication
@ComponentScan(basePackageClasses = IndexController.class)
public class JdrNaheulbeukApplication {

	public static void main(String[] args) {
		SpringApplication.run(JdrNaheulbeukApplication.class, args);
	}
}
