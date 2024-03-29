package com.labs.springbatchsamples;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class SpringBatchSamplesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBatchSamplesApplication.class, args);
	}

}
