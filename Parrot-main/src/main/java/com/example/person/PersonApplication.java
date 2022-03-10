package com.example.person;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PersonApplication {
	public static void main(String[] args) {
		var context = SpringApplication.run(PersonApplication.class, args);
		Person p = context.getBean(Person.class);
		System.out.println(p.getName());
		System.out.println(p.getParrot().getName());
	}
}
