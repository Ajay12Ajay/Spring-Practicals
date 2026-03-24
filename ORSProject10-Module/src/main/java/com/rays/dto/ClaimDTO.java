package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_claim")
public class ClaimDTO extends BaseDTO {

	@Column(name = "claimNumber", length = 50, unique = true)
	private String claimNumber;

	@Column(name = "claimAmount")
	private Double claimAmount;

	@Column(name = "status", length = 50)
	private String status;

	// Getters & Setters

	public String getClaimNumber() {
		return claimNumber;
	}

	public void setClaimNumber(String claimNumber) {
		this.claimNumber = claimNumber;
	}

	public Double getClaimAmount() {
		return claimAmount;
	}

	public void setClaimAmount(Double claimAmount) {
		this.claimAmount = claimAmount;
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
		return status;
	}

	@Override
	public String getUniqueKey() {
		return "claimNumber";
	}

	@Override
	public String getUniqueValue() {
		return claimNumber;
	}

	@Override
	public String getLabel() {
		return "claimNumber";
	}

	@Override
	public String getTableName() {
		return "Claim";
	}
}