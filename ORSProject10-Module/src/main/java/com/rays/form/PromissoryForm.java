package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.PromissoryDTO;

public class PromissoryForm extends BaseForm {

	@NotEmpty(message = "promissoryNoteId is required")
	private String promissoryNoteId;

	@NotEmpty(message = "payeeName is required")
	private String payeeName;

	@NotNull(message = "faceAmount is required")
	private Double faceAmount;

	@NotNull(message = "issueDate is required")
	private Date issueDate;

	@NotEmpty(message = "status is required")
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

	@Override
	public BaseDTO getDto() {

		PromissoryDTO dto = initDTO(new PromissoryDTO());

		dto.setPromissoryNoteId(promissoryNoteId);
		dto.setPayeeName(payeeName);
		dto.setFaceAmount(faceAmount);
		dto.setIssueDate(issueDate);
		dto.setStatus(status);

		return dto;
	}
}