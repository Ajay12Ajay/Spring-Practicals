package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.OrganizationDTO;

public class OrganizationForm extends BaseForm {

    @NotEmpty(message = "organizationCode is required")
    private String organizationCode;

    @NotEmpty(message = "organizationName is required")
    private String organizationName;

    @NotEmpty(message = "address is required")
    private String address;

    @NotEmpty(message = "status is required")
    private String status;

    // Getters & Setters

    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public BaseDTO getDto() {

        OrganizationDTO dto = initDTO(new OrganizationDTO());

        dto.setOrganizationCode(organizationCode);
        dto.setOrganizationName(organizationName);
        dto.setAddress(address);
        dto.setStatus(status);

        return dto;
    }
}