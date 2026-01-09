package com.rays.bynotype;

public class UserService {

	public UserDAOInt userDao;

	public UserService(UserDAOInt userDao) {

		this.userDao = userDao;
	}

	public void testAdd() {
		userDao.add();
	}

}
