package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.HealthCheckDTO;

public class HealthCheckForm extends BaseForm {

	@NotEmpty(message = "healthCode is required")
	private String healthCode;

	@NotEmpty(message = "serviceName is required")
	private String serviceName;

	@NotEmpty(message = "uptime is required")
	private String uptime;

	@NotEmpty(message = "status is required")
	private String status;

	// Getters & Setters

	public String getHealthCode() {
		return healthCode;
	}

	public void setHealthCode(String healthCode) {
		this.healthCode = healthCode;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getUptime() {
		return uptime;
	}

	public void setUptime(String uptime) {
		this.uptime = uptime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public BaseDTO getDto() {

		HealthCheckDTO dto = initDTO(new HealthCheckDTO());

		dto.setHealthCode(healthCode);
		dto.setServiceName(serviceName);
		dto.setUptime(uptime);
		dto.setStatus(status);

		return dto;
	}
}