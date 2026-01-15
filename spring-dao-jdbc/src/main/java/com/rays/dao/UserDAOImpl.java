package com.rays.dao;

import java.sql.ResultSet;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.rays.dto.UserDTO;

@Repository
public class UserDAOImpl implements UserDAOInt {

	private JdbcTemplate jdbcTemplate;

	private DataSource dataSource = null;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public long nextPK() {
		String sql = "select max(id) from st_user ";

		Long pk = jdbcTemplate.queryForObject(sql, Long.class);

		if (pk == null) {
			return 1;
		} else {
			return pk + 1;
		}

	}

	@Override
	public long add(UserDTO dto) {
		String sql = "insert into st_user value(?,?,?,?,?)";

		int pk = jdbcTemplate.update(sql, dto.getId(), dto.getFirstName(), dto.getLastName(), dto.getLogin(),
				dto.getPassword());

		System.out.println("Added Sucessfully...");

		return pk;

	}

	@Override
	public void update(UserDTO dto) {
		String sql = "update  st_user set firstName=?, lastName=?, login=?, password=? where id=?";

		int pk = jdbcTemplate.update(sql, dto.getFirstName(), dto.getLastName(), dto.getLogin(), dto.getPassword(),
				dto.getId());

		System.out.println("Updated successfully...." + pk);

	}

	@Override
	public void delete(long id) {
		String sql = "delete from st_user where id=?";

		int pk = jdbcTemplate.update(sql, id);

		System.out.println("Deleted Successfully..." + pk);

	}

	@Override
	public List list() {
		String sql = "select * from st_user";

		List list = jdbcTemplate.query(sql, new UserMapper());

		return list;

	}

	@Override
	public List search(UserDTO dto, int pageNo, int pageSize) {

		StringBuffer sql = new StringBuffer("select * from st_user where 1=1 ");

		if (dto != null) {

			if (dto.getFirstName() != null && dto.getFirstName().length() > 0) {
				sql.append("and firstName like '" + dto.getFirstName() + "%'");
			}

			if (dto.getLastName() != null && dto.getLastName().length() > 0) {
				sql.append("and lastName like '" + dto.getLastName() + "%'");
			}
			if (dto.getLogin() != null && dto.getLogin().length() > 0) {
				sql.append("and login like '" + dto.getLogin() + "%'");
			}
			if (dto.getPassword() != null && dto.getPassword().length() > 0) {
				sql.append("and password like '" + dto.getPassword() + "%'");
			}

			if (pageSize > 0) {
				pageNo = (pageNo = 1) * pageSize;
				sql.append(" limit" + pageNo + "," + pageSize);
			}

		}

		System.out.println("SQL Query :" + sql.toString());

		List list = jdbcTemplate.query(sql.toString(), new UserMapper());

		return list;
	}

	@Override
	public UserDTO authenticate(String login, String password) {

		String sql = "select * from st_user where login like '" + login + "' and password like '" + password + "'";

		UserDTO dto = jdbcTemplate.queryForObject(sql, new UserMapper());

		return dto;
	}

	@Override
	public UserDTO findByLogin(String login) {
		String sql = "select * from st_user where login like '" + login + "'";

		UserDTO dto = jdbcTemplate.queryForObject(sql, new UserMapper());

		return dto;
	}

}
