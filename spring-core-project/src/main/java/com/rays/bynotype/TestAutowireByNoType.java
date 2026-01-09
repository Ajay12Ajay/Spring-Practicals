package com.rays.bynotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowireByNoType {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("autowire-by-notype.xml");
		UserService userService = context.getBean("userService", UserService.class);
		userService.testAdd();
	}

}
