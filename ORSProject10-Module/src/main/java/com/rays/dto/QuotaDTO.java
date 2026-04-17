package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_quota")
public class QuotaDTO extends BaseDTO {

	@Column(name = "quotaCode", length = 50, unique = true)
	private String quotaCode;

	@Column(name = "userName", length = 100)
	private String userName;

	@Column(name = "limitValue")
	private Integer limitValue;

	@Column(name = "status", length = 50)
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

	// BaseDTO methods

	@Override
	public String getValue() {
		return userName;
	}

	@Override
	public String getUniqueKey() {
		return "quotaCode";
	}

	@Override
	public String getUniqueValue() {
		return quotaCode;
	}

	@Override
	public String getLabel() {
		return "quotaCode";
	}

	@Override
	public String getTableName() {
		return "Quota";
	}
}