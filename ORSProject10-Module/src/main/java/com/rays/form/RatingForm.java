package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.RatingDTO;

public class RatingForm extends BaseForm {

    @NotEmpty(message = "ratingCode is required")
    @Pattern(regexp = "^[A-Z]+-[0-9]+$")
    private String ratingCode;

    @NotEmpty(message = "userName is required")
    private String userName;

    @NotNull(message = "ratingValue is required")
    private Integer ratingValue;

    @NotEmpty(message = "ratingStatus is required")
    private String ratingStatus;

    // Getters & Setters

    public String getRatingCode() {
        return ratingCode;
    }

    public void setRatingCode(String ratingCode) {
        this.ratingCode = ratingCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getRatingValue() {
        return ratingValue;
    }

    public void setRatingValue(Integer ratingValue) {
        this.ratingValue = ratingValue;
    }

    public String getRatingStatus() {
        return ratingStatus;
    }

    public void setRatingStatus(String ratingStatus) {
        this.ratingStatus = ratingStatus;
    }

    // Convert Form → DTO

    @Override
    public BaseDTO getDto() {

        RatingDTO dto = initDTO(new RatingDTO());

        dto.setRatingCode(ratingCode);
        dto.setUserName(userName);
        dto.setRatingValue(ratingValue);
        dto.setRatingStatus(ratingStatus);

        return dto;
    }
}