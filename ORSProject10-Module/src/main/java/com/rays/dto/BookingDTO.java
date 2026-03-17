package com.rays.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_booking")
public class BookingDTO extends BaseDTO {

	@Column(name = "bookingCode", length = 50)
	private String bookingCode;

	@Column(name = "customerName", length = 50)
	private String customerName;

	@Column(name = "bookingDate")
	private Date bookingDate;

	@Column(name = "bookingStatus", length = 50)
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
	public String getValue() {
		// TODO Auto-generated method stub
		return bookingStatus;
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "bookingCode";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return bookingCode;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "bookingCode";
	}

	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "Booking";
	}

}
