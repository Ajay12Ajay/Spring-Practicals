package com.rays.service;

import java.util.List;

import com.rays.dto.UserDTO;

public interface UserServiceInt {

	public long add(UserDTO dto);

	public void update(UserDTO dto);

	public void delete(long id);

	public List search(UserDTO dto, int pageNo, int pageSize);

	public UserDTO authenticate(String login, String password);

	public UserDTO findByLogin(String login);

	public UserDTO findByPk(long id);

}
