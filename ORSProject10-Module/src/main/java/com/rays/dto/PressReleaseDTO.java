package com.rays.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_pressrelease")
public class PressReleaseDTO extends BaseDTO {

	@Column(name = "pressReleaseId", unique = true)
	private Long pressReleaseId;

	@Column(name = "title", length = 100)
	private String title;

	@Column(name = "releaseDate")
	private Date releaseDate;

	@Column(name = "author", length = 50)
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

	// BaseDTO methods

	@Override
	public String getValue() {
		return title;
	}

	@Override
	public String getUniqueKey() {
		return "pressReleaseId";
	}

	@Override
	public String getUniqueValue() {
		return String.valueOf(pressReleaseId);
	}

	@Override
	public String getLabel() {
		return "pressReleaseId";
	}

	@Override
	public String getTableName() {
		return "PressRelease";
	}
}