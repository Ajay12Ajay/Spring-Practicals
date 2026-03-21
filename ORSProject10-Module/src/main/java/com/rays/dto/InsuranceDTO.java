package com.rays.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_insurance")
public class InsuranceDTO extends BaseDTO {

    @Column(name = "policyNumber", length = 50, unique = true)
    private String policyNumber;

    @Column(name = "policyHolderName", length = 50)
    private String policyHolderName;

    @Column(name = "expiryDate")
    private Date expiryDate;

    @Column(name = "insuranceStatus", length = 50)
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
    public String getValue() {
        return insuranceStatus;
    }

    @Override
    public String getUniqueKey() {
        return "policyNumber";
    }

    @Override
    public String getUniqueValue() {
        return policyNumber;
    }

    @Override
    public String getLabel() {
        return "policyNumber";
    }

    @Override
    public String getTableName() {
        return "Insurance";
    }
}