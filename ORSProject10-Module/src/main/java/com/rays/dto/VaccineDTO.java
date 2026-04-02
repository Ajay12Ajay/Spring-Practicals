package com.rays.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_vaccine")
public class VaccineDTO extends BaseDTO {

    @Column(name = "vaccineId", length = 50, unique = true)
    private String vaccineId;

    @Column(name = "vaccineName", length = 100)
    private String vaccineName;

    @Column(name = "manufacturer", length = 100)
    private String manufacturer;

    @Column(name = "expiryDate")
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

    // BaseDTO methods

    @Override
    public String getValue() {
        return vaccineName;
    }

    @Override
    public String getUniqueKey() {
        return "vaccineId";
    }

    @Override
    public String getUniqueValue() {
        return vaccineId;
    }

    @Override
    public String getLabel() {
        return "vaccineName";
    }

    @Override
    public String getTableName() {
        return "Vaccine";
    }
}