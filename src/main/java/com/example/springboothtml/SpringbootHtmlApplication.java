package com.example.springboothtml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.session.jdbc.config.annotation.web.http.EnableJdbcHttpSession;

@SpringBootApplication
@EnableScheduling
@EnableJdbcHttpSession
public class SpringbootHtmlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHtmlApplication.class, args);
	}

}
