package com.rays.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_transportation")
public class TransportationDTO extends BaseDTO {

    @Column(name = "description", length = 100, unique = true)
    private String description;

    @Column(name = "mode", length = 50)
    private String mode;

    @Column(name = "dob")
    private Date dob;

    @Column(name = "cost", length = 50)
    private String cost;

    // Getters & Setters

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    // BaseDTO methods

    @Override
    public String getValue() {
        return mode;
    }

    @Override
    public String getUniqueKey() {
        return "description";
    }

    @Override
    public String getUniqueValue() {
        return description;
    }

    @Override
    public String getLabel() {
        return "description";
    }

    @Override
    public String getTableName() {
        return "Transportation";
    }
}