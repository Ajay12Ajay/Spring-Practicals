package com.rays.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.rays.dao.UserDAO;
import com.rays.dto.UserDTO;

@Service
public class UserService {

	@Autowired
	public UserDAO dao;

	public UserDTO authenticate(String login, String password) {
		UserDTO dto = dao.findByUniqueKey("login", login);
		if (dto != null) {
			if (dto.getPassword().equals(password)) {
				return dto;
			}
		}
		return null;
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public Long add(UserDTO dto) {
		Long id = dao.add(dto);
		return id;
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void update(UserDTO dto) {
		dao.update(dto);
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void delete(long id) {
		try {
			UserDTO dto = findById(id);
			dao.delete(dto);
		} catch (RuntimeException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}

	public UserDTO findById(long pk) {
		UserDTO dto = dao.findByPk(pk);
		return dto;
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public long save(UserDTO dto) {
		Long id = dto.getId();
		if (id != null && id > 0) {
			update(dto);
		} else {
			id = add(dto);
		}
		return id;
	}

	@Transactional(readOnly = true)
	public List search(UserDTO dto, int pageNo, int pageSize) {
		List<UserDTO> list = dao.search(dto, pageNo, pageSize);
		return list;
	}

	@Transactional(readOnly = true)
	public UserDTO findByLogin(String login) {
		UserDTO dto = dao.findByUniqueKey("login", login);
		return dto;
	}
}
