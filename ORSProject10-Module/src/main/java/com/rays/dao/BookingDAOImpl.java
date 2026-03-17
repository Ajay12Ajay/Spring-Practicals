package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.BookingDTO;

@Repository
public class BookingDAOImpl extends BaseDAOImpl<BookingDTO> implements BookingDAOInt {

	@Override
	public Class<BookingDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return BookingDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(BookingDTO dto, CriteriaBuilder builder, Root<BookingDTO> qRoot) {
		// TODO Auto-generated method stub
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getBookingCode())) {

			whereCondition.add(builder.equal(qRoot.get("bookingCode"), dto.getBookingCode()));
		}

		if (!isEmptyString(dto.getCustomerName())) {

			whereCondition.add(builder.like(qRoot.get("customerName"), dto.getCustomerName() + "%"));
		}

		if (isNotNull(dto.getBookingDate())) {

			whereCondition.add(builder.equal(qRoot.get("bookingDate"), dto.getBookingDate()));
		}

		if (!isEmptyString(dto.getBookingStatus())) {

			whereCondition.add(builder.like(qRoot.get("bookingStatus"), dto.getBookingStatus() + "%"));
		}

		return whereCondition;

	}

}
