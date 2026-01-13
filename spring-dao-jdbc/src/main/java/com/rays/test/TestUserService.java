package com.rays.test;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.rays.dto.UserDTO;
import com.rays.service.UserServiceInt;

@Component("testUserService")
public class TestUserService {

	@Autowired
	public UserServiceInt service = null;

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		TestUserService service = (TestUserService) context.getBean("testUserService");

		// service.testAdd();
		// service.testUpdate();
		// service.testDelete();
		// service.testList();
		// service.testSearch();
		// service.testAuthenticate();
		// service.testFindByLogin();
	}

	private void testFindByLogin() {
		UserDTO dto = service.findByLogin("ajaystl3@gmail.com");

		if (dto != null) {
			System.out.println(dto.getId());
			System.out.println(dto.getFirstName());
			System.out.println(dto.getLastName());
			System.out.println(dto.getLogin());
			System.out.println(dto.getPassword());
		} else {
			System.out.println("Username not found...");
		}

	}

	private void testAdd() {

		UserDTO dto = new UserDTO();

		dto.setId(2);
		dto.setFirstName("Aniket");
		dto.setLastName("Rajput");
		dto.setLogin("aniket@gmail.com");
		dto.setPassword("123");

		service.add(dto);

		System.out.println("data Inserted...test");

	}

	private void testUpdate() {

		UserDTO dto = new UserDTO();

		dto.setFirstName("Malay");
		dto.setLastName("Dongre");
		dto.setLogin("malay@gmail.com");
		dto.setPassword("123");
		dto.setId(2);

		service.update(dto);

		System.out.println("data Updated...test");
	}

	private void testDelete() {
		service.delete(2);

	}

	private void testList() {

		List list = service.list();

		Iterator<UserDTO> it = list.iterator();

		while (it.hasNext()) {
			UserDTO dto = it.next();
			System.out.println(dto.getId());
			System.out.println(dto.getFirstName());
			System.out.println(dto.getLastName());
			System.out.println(dto.getLogin());
			System.out.println(dto.getPassword());
		}
	}

	private void testSearch() {

		UserDTO dto = new UserDTO();
		dto.setFirstName("Ajay");

		List list = service.search(dto, 0, 0);
		Iterator<UserDTO> it = list.iterator();
		while (it.hasNext()) {
			UserDTO dto1 = it.next();
			System.out.println(dto1.getId());
			System.out.println(dto1.getFirstName());
			System.out.println(dto1.getLastName());
			System.out.println(dto1.getLogin());
			System.out.println(dto1.getPassword());
		}

	}

	private void testAuthenticate() {
		UserDTO dto = service.authenticate("ajaystl3@gmail.com", "123");

		if (dto != null) {
			System.out.println(dto.getId());
			System.out.println(dto.getFirstName());
			System.out.println(dto.getLastName());
			System.out.println(dto.getLogin());
			System.out.println(dto.getPassword());
		} else {
			System.out.println("invalid username OR password....!");
		}

	}

}
