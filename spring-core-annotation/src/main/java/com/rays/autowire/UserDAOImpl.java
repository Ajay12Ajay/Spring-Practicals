package com.rays.autowire;

import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl implements UserDAOInt {

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("..add method..bytype..");
	}

}
