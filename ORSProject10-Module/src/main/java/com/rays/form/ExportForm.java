package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.ExportDTO;

public class ExportForm extends BaseForm {

	@NotEmpty(message = "exportCode is required")
	private String exportCode;

	@NotEmpty(message = "fileName is required")
	private String fileName;

	@NotEmpty(message = "format is required")
	private String format;

	@NotEmpty(message = "status is required")
	private String status;

	// Getters & Setters

	public String getExportCode() {
		return exportCode;
	}

	public void setExportCode(String exportCode) {
		this.exportCode = exportCode;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public BaseDTO getDto() {

		ExportDTO dto = initDTO(new ExportDTO());

		dto.setExportCode(exportCode);
		dto.setFileName(fileName);
		dto.setFormat(format);
		dto.setStatus(status);

		return dto;
	}
}