package com.email;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootEmailIntegrationApplication {

	//Google Account -> Security -> 2-Step verification -> input password as asked -> Turn on 
	//Google Account -> Security -> App password -> input password as asked -> select the app and device -> Generate 
	//Use a 16-character password with Gmail username in your application
	public static void main(String[] args) {
		SpringApplication.run(SpringBootEmailIntegrationApplication.class, args);
	}

}
