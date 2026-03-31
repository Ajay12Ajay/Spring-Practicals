package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.PressReleaseDTO;

public class PressReleaseForm extends BaseForm {

	@NotNull(message = "pressReleaseId is required")
	private Long pressReleaseId;

	@NotEmpty(message = "title is required")
	private String title;

	@NotNull(message = "releaseDate is required")
	private Date releaseDate;

	@NotEmpty(message = "author is required")
	private String author;

	// Getters & Setters

	public Long getPressReleaseId() {
		return pressReleaseId;
	}

	public void setPressReleaseId(Long pressReleaseId) {
		this.pressReleaseId = pressReleaseId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public BaseDTO getDto() {

		PressReleaseDTO dto = initDTO(new PressReleaseDTO());

		dto.setPressReleaseId(pressReleaseId);
		dto.setTitle(title);
		dto.setReleaseDate(releaseDate);
		dto.setAuthor(author);

		return dto;
	}
}