package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.InsuranceDTO;

public class InsuranceForm extends BaseForm {

    @NotEmpty(message = "policyNumber is required")
    @Pattern(regexp = "^[A-Z]+-[0-9]+$")
    private String policyNumber;

    @NotEmpty(message = "policyHolderName is required")
    private String policyHolderName;

    @NotNull(message = "expiryDate is required")
    private Date expiryDate;

    @NotEmpty(message = "insuranceStatus is required")
    private String insuranceStatus;

    // Getters & Setters
    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getPolicyHolderName() {
        return policyHolderName;
    }

    public void setPolicyHolderName(String policyHolderName) {
        this.policyHolderName = policyHolderName;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getInsuranceStatus() {
        return insuranceStatus;
    }

    public void setInsuranceStatus(String insuranceStatus) {
        this.insuranceStatus = insuranceStatus;
    }

    @Override
    public BaseDTO getDto() {

        InsuranceDTO dto = initDTO(new InsuranceDTO());

        dto.setPolicyNumber(policyNumber);
        dto.setPolicyHolderName(policyHolderName);
        dto.setExpiryDate(expiryDate);
        dto.setInsuranceStatus(insuranceStatus);

        return dto;
    }
}