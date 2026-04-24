package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_archivalpolicy")
public class ArchivalPolicyDTO extends BaseDTO {

	@Column(name = "policyCode", length = 50, unique = true)
	private String policyCode;

	@Column(name = "dataType", length = 100)
	private String dataType;

	@Column(name = "archiveAfterDays")
	private Integer archiveAfterDays;

	@Column(name = "status", length = 50)
	private String status;

	// Getters & Setters

	public String getPolicyCode() {
		return policyCode;
	}

	public void setPolicyCode(String policyCode) {
		this.policyCode = policyCode;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public Integer getArchiveAfterDays() {
		return archiveAfterDays;
	}

	public void setArchiveAfterDays(Integer archiveAfterDays) {
		this.archiveAfterDays = archiveAfterDays;
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
		return dataType;
	}

	@Override
	public String getUniqueKey() {
		return "policyCode";
	}

	@Override
	public String getUniqueValue() {
		return policyCode;
	}

	@Override
	public String getLabel() {
		return "policyCode";
	}

	@Override
	public String getTableName() {
		return "ArchivalPolicy";
	}
}