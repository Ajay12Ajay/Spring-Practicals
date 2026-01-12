package com.rays.autowire_bysetter;

import org.springframework.stereotype.Repository;

@Repository("userDaoBySetter")
public class UserDAOImpl implements UserDAOInt {

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("..add method..bysetter..");
	}

}
