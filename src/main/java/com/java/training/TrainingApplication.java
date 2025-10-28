package com.java.training;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class TrainingApplication {

	public static void main(String[] args) {
	//	log.info("SpringApplication.run(TrainingApplication.class, args)");
		SpringApplication.run(TrainingApplication.class, args);
	}

}
