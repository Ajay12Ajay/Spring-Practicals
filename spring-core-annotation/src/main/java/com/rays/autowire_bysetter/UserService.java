package com.rays.autowire_bysetter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userServiceBySetter")
public class UserService {

	private UserDAOInt userDaoBySetter;

	@Autowired
	public void setUserDaoBySetter(UserDAOInt userDaoBySetter) {
		this.userDaoBySetter = userDaoBySetter;
	}

	public void testAdd() {
		userDaoBySetter.add();
	}

}
