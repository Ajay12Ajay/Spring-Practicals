package com.rays.autowire_byname;

import org.springframework.stereotype.Repository;

@Repository("userDaoByName")
public class UserDAOImpl implements UserDAOInt {

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("..add method..byname..");
	}

}
