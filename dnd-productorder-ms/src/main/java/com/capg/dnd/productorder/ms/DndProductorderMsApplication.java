package com.capg.dnd.productorder.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication


public class DndProductorderMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DndProductorderMsApplication.class, args);
	   System.out.println("hello world");
	}

}

