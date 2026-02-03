package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.RoleDTO;

public class RoleForm extends BaseForm {

	@NotEmpty(message = "name is required")
	private String name;

	@NotEmpty(message = "discriptions is required")
	private String discriptions;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDiscriptions() {
		return discriptions;
	}

	public void setDiscriptions(String discriptions) {
		this.discriptions = discriptions;
	}

	@Override
	public BaseDTO getDto() {
		RoleDTO dto = new RoleDTO();
		dto.setName(name);
		dto.setDiscriptions(discriptions);
		return dto;
	}
}
