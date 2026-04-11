package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.NotificationTemplateDTO;

public class NotificationTemplateForm extends BaseForm {

	@NotEmpty(message = "templateCode is required")
	private String templateCode;

	@NotEmpty(message = "title is required")
	private String title;

	@NotEmpty(message = "content is required")
	private String content;

	@NotEmpty(message = "status is required")
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

	@Override
	public BaseDTO getDto() {

		NotificationTemplateDTO dto = initDTO(new NotificationTemplateDTO());

		dto.setTemplateCode(templateCode);
		dto.setTitle(title);
		dto.setContent(content);
		dto.setStatus(status);

		return dto;
	}
}