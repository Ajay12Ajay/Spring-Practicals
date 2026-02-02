package com.rays.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.rays.dao.UserDAO;
import com.rays.dto.RoleDTO;
import com.rays.dto.UserDTO;

@Service
public class UserService {

	@Autowired
	public UserDAO userService;

	@Transactional(propagation = Propagation.REQUIRED)
	public Long add(UserDTO dto) {
		Long id = userService.add(dto);
		return id;
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void update(UserDTO dto) {
		userService.update(dto);
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void delete(long id) {
		try {
			UserDTO dto = findById(id);
			userService.delete(dto);
		} catch (RuntimeException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}

	public UserDTO findById(long pk) {
		UserDTO dto = userService.findByPk(pk);
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
}
