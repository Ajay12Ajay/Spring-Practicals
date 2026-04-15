package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_organization")
public class OrganizationDTO extends BaseDTO {

	@Column(name = "organizationCode", length = 50, unique = true)
	private String organizationCode;

	@Column(name = "organizationName", length = 100)
	private String organizationName;

	@Column(name = "address", length = 255)
	private String address;

	@Column(name = "status", length = 50)
	private String status;

	// Getters & Setters

	public String getOrganizationCode() {
		return organizationCode;
	}

	public void setOrganizationCode(String organizationCode) {
		this.organizationCode = organizationCode;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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
		return organizationName;
	}

	@Override
	public String getUniqueKey() {
		return "organizationCode";
	}

	@Override
	public String getUniqueValue() {
		return organizationCode;
	}

	@Override
	public String getLabel() {
		return "organizationCode";
	}

	@Override
	public String getTableName() {
		return "Organization";
	}
}