package com.rays.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_promissory")
public class PromissoryDTO extends BaseDTO {

	@Column(name = "promissoryNoteId", length = 50, unique = true)
	private String promissoryNoteId;

	@Column(name = "payeeName", length = 100)
	private String payeeName;

	@Column(name = "faceAmount")
	private Double faceAmount;

	@Column(name = "issueDate")
	private Date issueDate;

	@Column(name = "status", length = 50)
	private String status;

	// Getters & Setters

	public String getPromissoryNoteId() {
		return promissoryNoteId;
	}

	public void setPromissoryNoteId(String promissoryNoteId) {
		this.promissoryNoteId = promissoryNoteId;
	}

	public String getPayeeName() {
		return payeeName;
	}

	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}

	public Double getFaceAmount() {
		return faceAmount;
	}

	public void setFaceAmount(Double faceAmount) {
		this.faceAmount = faceAmount;
	}

	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
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
		return payeeName;
	}

	@Override
	public String getUniqueKey() {
		return "promissoryNoteId";
	}

	@Override
	public String getUniqueValue() {
		return promissoryNoteId;
	}

	@Override
	public String getLabel() {
		return "promissoryNoteId";
	}

	@Override
	public String getTableName() {
		return "Promissory";
	}
}