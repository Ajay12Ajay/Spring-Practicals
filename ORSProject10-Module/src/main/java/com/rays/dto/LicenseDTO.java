package com.rays.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_license")
public class LicenseDTO extends BaseDTO {

    @Column(name = "licenseKey", length = 50, unique = true)
    private String licenseKey;

    @Column(name = "productName", length = 50)
    private String productName;

    @Column(name = "expiryDate")
    private Date expiryDate;

    @Column(name = "licenseStatus", length = 50)
    private String licenseStatus;

    // Getters & Setters

    public String getLicenseKey() {
        return licenseKey;
    }

    public void setLicenseKey(String licenseKey) {
        this.licenseKey = licenseKey;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getLicenseStatus() {
        return licenseStatus;
    }

    public void setLicenseStatus(String licenseStatus) {
        this.licenseStatus = licenseStatus;
    }

    // BaseDTO methods

    @Override
    public String getValue() {
        return licenseStatus;
    }

    @Override
    public String getUniqueKey() {
        return "licenseKey";
    }

    @Override
    public String getUniqueValue() {
        return licenseKey;
    }

    @Override
    public String getLabel() {
        return "licenseKey";
    }

    @Override
    public String getTableName() {
        return "License";
    }
}