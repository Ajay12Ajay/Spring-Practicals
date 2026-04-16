package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_healthcheck")
public class HealthCheckDTO extends BaseDTO {

    @Column(name = "healthCode", length = 50, unique = true)
    private String healthCode;

    @Column(name = "serviceName", length = 100)
    private String serviceName;

    @Column(name = "uptime", length = 50)
    private String uptime;

    @Column(name = "status", length = 50)
    private String status;

    // Getters & Setters

    public String getHealthCode() {
        return healthCode;
    }

    public void setHealthCode(String healthCode) {
        this.healthCode = healthCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getUptime() {
        return uptime;
    }

    public void setUptime(String uptime) {
        this.uptime = uptime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // BaseDTO methods

    @Override
    public String getValue() {
        return serviceName;
    }

    @Override
    public String getUniqueKey() {
        return "healthCode";
    }

    @Override
    public String getUniqueValue() {
        return healthCode;
    }

    @Override
    public String getLabel() {
        return "healthCode";
    }

    @Override
    public String getTableName() {
        return "HealthCheck";
    }
}