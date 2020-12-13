package com.hong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringbootHtmlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHtmlApplication.class, args);
	}

}
