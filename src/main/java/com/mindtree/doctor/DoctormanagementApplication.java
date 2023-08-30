package com.mindtree.doctor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaClient
public class DoctormanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoctormanagementApplication.class, args);
	}

}
