package com.rays.test;

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

		TestUserService test = (TestUserService) context.getBean("testUserService");

		// test.testAdd();

		// test.testUpdate();

		// test.testFindByPk();

		// test.testDelete();

		test.testAuthenticate();

		// test.testFindByLogin();

		// test.testSearch();
	}

	private void testAuthenticate() {
		UserDTO dto = new UserDTO();
		dto = service.authenticate("ajaystl3@gmail.com", "123");
		if (dto != null) {
			System.out.println(dto.getId());
			System.out.println(dto.getFirstName());
			System.out.println(dto.getLastName());
			System.out.println(dto.getLogin());
			System.out.println(dto.getPassword());
		} else {
			System.out.println("user Not found");
		}

	}

	private void testSearch() {

		UserDTO dto = null;
		List<UserDTO> list = service.search(dto, 0, 5);
		for (UserDTO dto1 : list) {
			System.out.println(dto1.getId());
			System.out.println(dto1.getFirstName());
			System.out.println(dto1.getLastName());
			System.out.println(dto1.getLogin());
			System.out.println(dto1.getPassword());
		}

	}

	private void testFindByLogin() {
		UserDTO dto = service.findByLogin("ajaystl3@gmail.com");

		System.out.println(dto.getFirstName());
		System.out.println(dto.getLastName());

	}

	private void testDelete() {
		service.delete(3);

	}

	private void testFindByPk() {
		UserDTO dto = service.findByPk(1);

		System.out.println(dto.getFirstName());
		System.out.println(dto.getLastName());

	}

	private void testUpdate() {
		UserDTO dto = new UserDTO();

		dto.setId(2);
		dto.setFirstName("Akshat");
		dto.setLastName("Saxena");
		dto.setLogin("akshat@gmail.com");
		dto.setPassword("123");

		service.update(dto);

	}

	private void testAdd() {
		// TODO Auto-generated method stub

		UserDTO dto = new UserDTO();

		dto.setFirstName("Malay");
		dto.setLastName("Dongre");
		dto.setLogin("malay@gmail.com");
		dto.setPassword("123");

		Long pk = service.add(dto);

		System.out.println("Pk--->" + pk);

	}

}
