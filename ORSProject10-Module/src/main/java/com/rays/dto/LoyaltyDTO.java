package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_loyalty")
public class LoyaltyDTO extends BaseDTO {

	@Column(name = "loyaltyCode", length = 50, unique = true)
	private String loyaltyCode;

	@Column(name = "userName", length = 100)
	private String userName;

	@Column(name = "points")
	private Double points;

	@Column(name = "status", length = 50)
	private String status;

	// Getters & Setters

	public String getLoyaltyCode() {
		return loyaltyCode;
	}

	public void setLoyaltyCode(String loyaltyCode) {
		this.loyaltyCode = loyaltyCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Double getPoints() {
		return points;
	}

	public void setPoints(Double points) {
		this.points = points;
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
		return "loyaltyCode";
	}

	@Override
	public String getUniqueValue() {
		return loyaltyCode;
	}

	@Override
	public String getLabel() {
		return "loyaltyCode";
	}

	@Override
	public String getTableName() {
		return "Loyalty";
	}
}