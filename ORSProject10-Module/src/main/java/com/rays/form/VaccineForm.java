package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.VaccineDTO;

public class VaccineForm extends BaseForm {

	@NotEmpty(message = "vaccineId is required")
	private String vaccineId;

	@NotEmpty(message = "vaccineName is required")
	private String vaccineName;

	@NotEmpty(message = "manufacturer is required")
	private String manufacturer;

	@NotNull(message = "expiryDate is required")
	private Date expiryDate;

	// Getters & Setters

	public String getVaccineId() {
		return vaccineId;
	}

	public void setVaccineId(String vaccineId) {
		this.vaccineId = vaccineId;
	}

	public String getVaccineName() {
		return vaccineName;
	}

	public void setVaccineName(String vaccineName) {
		this.vaccineName = vaccineName;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Override
	public BaseDTO getDto() {

		VaccineDTO dto = initDTO(new VaccineDTO());

		dto.setVaccineId(vaccineId);
		dto.setVaccineName(vaccineName);
		dto.setManufacturer(manufacturer);
		dto.setExpiryDate(expiryDate);

		return dto;
	}
}