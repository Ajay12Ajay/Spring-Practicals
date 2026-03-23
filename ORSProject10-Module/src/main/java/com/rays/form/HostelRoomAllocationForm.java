package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.HostelRoomAllocationDTO;

public class HostelRoomAllocationForm extends BaseForm {

    @NotEmpty(message = "student_name is required")
    private String student_name;

    @NotEmpty(message = "room_number is required")
    @Pattern(regexp = "^[A-Z]+-[0-9]+$")
    private String room_number;

    @NotNull(message = "allotment_date is required")
    private Date allotment_date;

    @NotEmpty(message = "block_name is required")
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

    @Override
    public BaseDTO getDto() {

        HostelRoomAllocationDTO dto = initDTO(new HostelRoomAllocationDTO());

        dto.setStudent_name(student_name);
        dto.setRoom_number(room_number);
        dto.setAllotment_date(allotment_date);
        dto.setBlock_name(block_name);

        return dto;
    }
}