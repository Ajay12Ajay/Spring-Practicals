package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_timezone")
public class TimezoneDTO extends BaseDTO {

	@Column(name = "timezoneCode", length = 50, unique = true)
	private String timezoneCode;

	@Column(name = "timezoneName", length = 100)
	private String timezoneName;

	@Column(name = "offset", length = 20)
	private String offset;

	@Column(name = "status", length = 50)
	private String status;

	// Getters & Setters

	public String getTimezoneCode() {
		return timezoneCode;
	}

	public void setTimezoneCode(String timezoneCode) {
		this.timezoneCode = timezoneCode;
	}

	public String getTimezoneName() {
		return timezoneName;
	}

	public void setTimezoneName(String timezoneName) {
		this.timezoneName = timezoneName;
	}

	public String getOffset() {
		return offset;
	}

	public void setOffset(String offset) {
		this.offset = offset;
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
		return timezoneName;
	}

	@Override
	public String getUniqueKey() {
		return "timezoneCode";
	}

	@Override
	public String getUniqueValue() {
		return timezoneCode;
	}

	@Override
	public String getLabel() {
		return "timezoneCode";
	}

	@Override
	public String getTableName() {
		return "Timezone";
	}
}