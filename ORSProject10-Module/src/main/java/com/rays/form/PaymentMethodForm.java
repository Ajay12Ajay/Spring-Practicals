package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.PaymentMethodDTO;

public class PaymentMethodForm extends BaseForm {

	@NotEmpty(message = "methodCode is required")
	private String methodCode;

	@NotEmpty(message = "methodName is required")
	private String methodName;

	@NotEmpty(message = "provider is required")
	private String provider;

	@NotEmpty(message = "status is required")
	private String status;

	// Getters & Setters

	public String getMethodCode() {
		return methodCode;
	}

	public void setMethodCode(String methodCode) {
		this.methodCode = methodCode;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public BaseDTO getDto() {

		PaymentMethodDTO dto = initDTO(new PaymentMethodDTO());

		dto.setMethodCode(methodCode);
		dto.setMethodName(methodName);
		dto.setProvider(provider);
		dto.setStatus(status);

		return dto;
	}
}