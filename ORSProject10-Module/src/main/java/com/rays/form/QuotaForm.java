package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.QuotaDTO;

public class QuotaForm extends BaseForm {

	@NotEmpty(message = "quotaCode is required")
	private String quotaCode;

	@NotEmpty(message = "userName is required")
	private String userName;

	@NotNull(message = "limitValue is required")
	private Integer limitValue;

	@NotEmpty(message = "status is required")
	private String status;

	// Getters & Setters

	public String getQuotaCode() {
		return quotaCode;
	}

	public void setQuotaCode(String quotaCode) {
		this.quotaCode = quotaCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getLimitValue() {
		return limitValue;
	}

	public void setLimitValue(Integer limitValue) {
		this.limitValue = limitValue;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public BaseDTO getDto() {

		QuotaDTO dto = initDTO(new QuotaDTO());

		dto.setQuotaCode(quotaCode);
		dto.setUserName(userName);
		dto.setLimitValue(limitValue);
		dto.setStatus(status);

		return dto;
	}
}