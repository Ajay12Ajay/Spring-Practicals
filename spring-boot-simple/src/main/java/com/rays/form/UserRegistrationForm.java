package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.UserDTO;

public class UserRegistrationForm extends BaseForm {

	@NotEmpty(message = "firstName is required")
	private String firstName;

	@NotEmpty(message = "lastName is required")
	private String lastName;

	@NotEmpty(message = "loginName is required")
	private String login;

	@NotEmpty(message = "password is required")
	private String password;

	@NotNull(message = "dob is required")
	private Date dob;

	// @NotNull(message = "roleId is required")
	private Long roleId;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	@Override
	public BaseDTO getDto() {

		UserDTO dto = new UserDTO();
		dto.setFirstName(firstName);
		dto.setLastName(lastName);
		dto.setLogin(login);
		dto.setPassword(password);
		dto.setRoleId(2L);
		dto.setDob(dob);

		dto = (UserDTO) initDTO(dto);

		return dto;

	}

}
