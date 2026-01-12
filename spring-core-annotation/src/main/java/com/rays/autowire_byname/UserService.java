package com.rays.autowire_byname;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("userServiceByName")
public class UserService {

	@Autowired
	@Qualifier("userDaoByName")
	private UserDAOInt userDaoByName;

	public void testAdd() {
		userDaoByName.add();
	}

}
