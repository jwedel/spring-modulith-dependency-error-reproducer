package com.reproducer.modulith;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.reproducer.modulith.domain1.Domain1Service;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class ModulithApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModulithApplication.class, args);
	}

}
