package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_notificationtemplate")
public class NotificationTemplateDTO extends BaseDTO {

	@Column(name = "templateCode", length = 50, unique = true)
	private String templateCode;

	@Column(name = "title", length = 100)
	private String title;

	@Column(name = "content", length = 500)
	private String content;

	@Column(name = "status", length = 50)
	private String status;

	// Getters & Setters

	public String getTemplateCode() {
		return templateCode;
	}

	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
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
		return title;
	}

	@Override
	public String getUniqueKey() {
		return "templateCode";
	}

	@Override
	public String getUniqueValue() {
		return templateCode;
	}

	@Override
	public String getLabel() {
		return "templateCode";
	}

	@Override
	public String getTableName() {
		return "NotificationTemplate";
	}
}