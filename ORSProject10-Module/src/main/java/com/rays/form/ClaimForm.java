package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.ClaimDTO;

public class ClaimForm extends BaseForm {

    @NotEmpty(message = "claimNumber is required")
    private String claimNumber;

    @NotNull(message = "claimAmount is required")
    private Double claimAmount;

    @NotEmpty(message = "status is required")
    private String status;

    // Getters & Setters

    public String getClaimNumber() {
        return claimNumber;
    }

    public void setClaimNumber(String claimNumber) {
        this.claimNumber = claimNumber;
    }

    public Double getClaimAmount() {
        return claimAmount;
    }

    public void setClaimAmount(Double claimAmount) {
        this.claimAmount = claimAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public BaseDTO getDto() {

        ClaimDTO dto = initDTO(new ClaimDTO());

        dto.setClaimNumber(claimNumber);
        dto.setClaimAmount(claimAmount);
        dto.setStatus(status);

        return dto;
    }
}