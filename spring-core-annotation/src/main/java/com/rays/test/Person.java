package com.rays.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("person") // it tells which bean to be created here its person

@Component // to create multiple Person Object
public class Person {

	// @Value("Ram") //to set values for specific object(here person)
	private String name;

	// @Value("Indore")
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
