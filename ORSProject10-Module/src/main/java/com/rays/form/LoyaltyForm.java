package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.LoyaltyDTO;

public class LoyaltyForm extends BaseForm {

    @NotEmpty(message = "loyaltyCode is required")
    private String loyaltyCode;

    @NotEmpty(message = "userName is required")
    private String userName;

    @NotNull(message = "points is required")
    private Double points;

    @NotEmpty(message = "status is required")
    private String status;

    // Getters & Setters

    public String getLoyaltyCode() {
        return loyaltyCode;
    }

    public void setLoyaltyCode(String loyaltyCode) {
        this.loyaltyCode = loyaltyCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Double getPoints() {
        return points;
    }

    public void setPoints(Double points) {
        this.points = points;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public BaseDTO getDto() {

        LoyaltyDTO dto = initDTO(new LoyaltyDTO());

        dto.setLoyaltyCode(loyaltyCode);
        dto.setUserName(userName);
        dto.setPoints(points);
        dto.setStatus(status);

        return dto;
    }
}