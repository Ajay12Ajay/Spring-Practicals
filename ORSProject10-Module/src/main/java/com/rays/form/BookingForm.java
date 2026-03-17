package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.BookingDTO;
import com.rays.dto.CollegeDTO;

public class BookingForm extends BaseForm {

	@NotEmpty(message = "bookingCode is required")
	@Pattern(regexp = "^[A-Z]+-[0-9]+$")
	private String bookingCode;

	@NotEmpty(message = "customerName is required")
	private String customerName;

	@NotNull(message = "bookingDate is required")
	private Date bookingDate;

	@NotEmpty(message = "bookingStatus is required")
	private String bookingStatus;

	public String getBookingCode() {
		return bookingCode;
	}

	public void setBookingCode(String bookingCode) {
		this.bookingCode = bookingCode;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	@Override
	public BaseDTO getDto() {
		// TODO Auto-generated method stub
		BookingDTO dto = initDTO(new BookingDTO());
		dto.setBookingCode(bookingCode);
		dto.setCustomerName(customerName);
		dto.setBookingDate(bookingDate);
		dto.setBookingStatus(bookingStatus);
		return dto;
	}

}
