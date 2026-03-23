package com.rays.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_hostelroomallocation")
public class HostelRoomAllocationDTO extends BaseDTO {

    @Column(name = "student_name", length = 50)
    private String student_name;

    @Column(name = "room_number", length = 50, unique = true)
    private String room_number;

    @Column(name = "allotment_date")
    private Date allotment_date;

    @Column(name = "block_name", length = 50)
    private String block_name;

    // Getters & Setters

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getRoom_number() {
        return room_number;
    }

    public void setRoom_number(String room_number) {
        this.room_number = room_number;
    }

    public Date getAllotment_date() {
        return allotment_date;
    }

    public void setAllotment_date(Date allotment_date) {
        this.allotment_date = allotment_date;
    }

    public String getBlock_name() {
        return block_name;
    }

    public void setBlock_name(String block_name) {
        this.block_name = block_name;
    }

    // BaseDTO methods

    @Override
    public String getValue() {
        return block_name;
    }

    @Override
    public String getUniqueKey() {
        return "room_number";
    }

    @Override
    public String getUniqueValue() {
        return room_number;
    }

    @Override
    public String getLabel() {
        return "room_number";
    }

    @Override
    public String getTableName() {
        return "HostelRoomAllocation";
    }
}