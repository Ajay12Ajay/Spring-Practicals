package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_export")
public class ExportDTO extends BaseDTO {

    @Column(name = "exportCode", length = 50, unique = true)
    private String exportCode;

    @Column(name = "fileName", length = 100)
    private String fileName;

    @Column(name = "format", length = 20)
    private String format;

    @Column(name = "status", length = 50)
    private String status;

    // Getters & Setters

    public String getExportCode() {
        return exportCode;
    }

    public void setExportCode(String exportCode) {
        this.exportCode = exportCode;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
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
        return fileName;
    }

    @Override
    public String getUniqueKey() {
        return "exportCode";
    }

    @Override
    public String getUniqueValue() {
        return exportCode;
    }

    @Override
    public String getLabel() {
        return "exportCode";
    }

    @Override
    public String getTableName() {
        return "Export";
    }
}