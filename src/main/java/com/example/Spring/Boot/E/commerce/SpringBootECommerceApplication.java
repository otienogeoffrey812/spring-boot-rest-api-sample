package com.example.Spring.Boot.E.commerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@ComponentScan({ "com.example.Spring.Boot.E.commerce.*"})
@EnableJpaRepositories
public class SpringBootECommerceApplication {

	public static void main(String[] args) {SpringApplication.run(SpringBootECommerceApplication.class, args);}

}
