package com.bit.carshowroom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication /*performs a component scans and searches for controllers,repo,entities,therefore we are able to call the
						endpoints from the carController.java */
public class CarshowroomApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarshowroomApplication.class, args);
	}

}
