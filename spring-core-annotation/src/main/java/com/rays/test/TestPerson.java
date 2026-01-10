package com.rays.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rays.AppConfig;

public class TestPerson {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Person p = context.getBean("person", Person.class);

		p.setName("Ram");
		p.setAddress("Indore");

		System.out.println(p.getName());
		System.out.println(p.getAddress());

		Person p1 = context.getBean("person", Person.class);

		p1.setName("Shyam");
		p1.setAddress("Bhopal");

		System.out.println(p1.getName());
		System.out.println(p1.getAddress());

	}

}
