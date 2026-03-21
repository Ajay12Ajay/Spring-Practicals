package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_rating")
public class RatingDTO extends BaseDTO {

    @Column(name = "ratingCode", length = 50, unique = true)
    private String ratingCode;

    @Column(name = "userName", length = 50)
    private String userName;

    @Column(name = "ratingValue")
    private Integer ratingValue;

    @Column(name = "ratingStatus", length = 50)
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

    // BaseDTO methods

    @Override
    public String getValue() {
        return ratingStatus;
    }

    @Override
    public String getUniqueKey() {
        return "ratingCode";
    }

    @Override
    public String getUniqueValue() {
        return ratingCode;
    }

    @Override
    public String getLabel() {
        return "ratingCode";
    }

    @Override
    public String getTableName() {
        return "Rating";
    }
}