package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.TransportationDTO;

public class TransportationForm extends BaseForm {

    @NotEmpty(message = "description is required")
    private String description;

    @NotEmpty(message = "mode is required")
    private String mode;

    @NotNull(message = "dob is required")
    private Date dob;

    @NotEmpty(message = "cost is required")
    private String cost;

    // Getters & Setters

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    @Override
    public BaseDTO getDto() {

        TransportationDTO dto = initDTO(new TransportationDTO());

        dto.setDescription(description);
        dto.setMode(mode);
        dto.setDob(dob);
        dto.setCost(cost);

        return dto;
    }
}