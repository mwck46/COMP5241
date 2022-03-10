package com.example.person;

import org.springframework.beans.factory.annotation.BeanFactoryAnnotationUtils;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PersonApplication {

	public static void main(String[] args) {

		var context = SpringApplication.run(PersonApplication.class, args);

		/*************************************
		 * Only 1 bean of type Person present
		 *************************************/
		//Person p = context.getBean(Person.class);
		//printPersion(p);


		/*************************************
		* Multiple bean of type Person present
		*************************************/
		Person p2 = BeanFactoryAnnotationUtils.qualifiedBeanOfType(context.getBeanFactory(), Person.class, "person2");
		printPersion(p2);


	}

	public static void printPersion(Person p)
	{
		System.out.println(p.getName());
		System.out.println(p.getParrot().getName());
	}
}
