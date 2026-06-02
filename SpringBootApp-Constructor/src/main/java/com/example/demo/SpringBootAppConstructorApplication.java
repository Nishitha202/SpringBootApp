package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootAppConstructorApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(SpringBootAppConstructorApplication.class, args);
		Laptop lp = ac.getBean(Laptop.class);
		lp.UseLaptop();
	}

}
