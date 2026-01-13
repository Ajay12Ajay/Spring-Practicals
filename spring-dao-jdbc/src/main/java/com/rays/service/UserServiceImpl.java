package com.rays.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.rays.dao.UserDAOInt;
import com.rays.dto.UserDTO;

@Service
public class UserServiceImpl implements UserServiceInt {

	@Autowired
	private UserDAOInt dao;

	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public long add(UserDTO dto) {
		long pk = dao.add(dto);
		return pk;
	}

	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public void update(UserDTO dto) {
		dao.update(dto);
	}

	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public void delete(int id) {
		dao.delete(id);
	}

	@Override
	public List list() {
		return dao.list();

	}

	@Override
	public List search(UserDTO dto, int pageNo, int pageSize) {

		return dao.search(dto, pageNo, pageSize);
	}

	@Override
	public UserDTO authenticate(String login, String password) {

		return dao.authenticate(login, password);

	}

	@Override
	public UserDTO findByLogin(String login) {

		return dao.findByLogin(login);
	}

}
