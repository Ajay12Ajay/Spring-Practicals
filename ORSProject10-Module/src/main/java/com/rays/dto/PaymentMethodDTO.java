package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_paymentmethod")
public class PaymentMethodDTO extends BaseDTO {

	@Column(name = "methodCode", length = 50, unique = true)
	private String methodCode;

	@Column(name = "methodName", length = 100)
	private String methodName;

	@Column(name = "provider", length = 100)
	private String provider;

	@Column(name = "status", length = 50)
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

	// BaseDTO methods

	@Override
	public String getValue() {
		return methodName;
	}

	@Override
	public String getUniqueKey() {
		return "methodCode";
	}

	@Override
	public String getUniqueValue() {
		return methodCode;
	}

	@Override
	public String getLabel() {
		return "methodCode";
	}

	@Override
	public String getTableName() {
		return "PaymentMethod";
	}
}