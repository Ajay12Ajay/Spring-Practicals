package com.rays.autowire_byconstructor;

import org.springframework.stereotype.Repository;

@Repository("userDaoByconst")
public class UserDAOImpl implements UserDAOInt {

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("..add method..byconstructor..");
	}

}
