package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.ArchivalPolicyDTO;

public class ArchivalPolicyForm extends BaseForm {

    @NotEmpty(message = "policyCode is required")
    private String policyCode;

    @NotEmpty(message = "dataType is required")
    private String dataType;

    @NotNull(message = "archiveAfterDays is required")
    private Integer archiveAfterDays;

    @NotEmpty(message = "status is required")
    private String status;

    // Getters & Setters

    public String getPolicyCode() {
        return policyCode;
    }

    public void setPolicyCode(String policyCode) {
        this.policyCode = policyCode;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public Integer getArchiveAfterDays() {
        return archiveAfterDays;
    }

    public void setArchiveAfterDays(Integer archiveAfterDays) {
        this.archiveAfterDays = archiveAfterDays;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public BaseDTO getDto() {

        ArchivalPolicyDTO dto = initDTO(new ArchivalPolicyDTO());

        dto.setPolicyCode(policyCode);
        dto.setDataType(dataType);
        dto.setArchiveAfterDays(archiveAfterDays);
        dto.setStatus(status);

        return dto;
    }
}