package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.LicenseDTO;

public class LicenseForm extends BaseForm {

    @NotEmpty(message = "licenseKey is required")
    @Pattern(regexp = "^[A-Z]+-[0-9]+$")
    private String licenseKey;

    @NotEmpty(message = "productName is required")
    private String productName;

    @NotNull(message = "expiryDate is required")
    private Date expiryDate;

    @NotEmpty(message = "licenseStatus is required")
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

    @Override
    public BaseDTO getDto() {

        LicenseDTO dto = initDTO(new LicenseDTO());

        dto.setLicenseKey(licenseKey);
        dto.setProductName(productName);
        dto.setExpiryDate(expiryDate);
        dto.setLicenseStatus(licenseStatus);

        return dto;
    }
}