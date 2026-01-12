package com.rays.autowire_byconstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userServiceByConst")
public class UserService {

	private UserDAOInt userDaoByconst;

	@Autowired
	public UserService(UserDAOInt userDaoByconst) {

		this.userDaoByconst = userDaoByconst;
	}

	public void testAdd() {
		userDaoByconst.add();
	}

}
