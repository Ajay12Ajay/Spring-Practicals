package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.TimezoneDTO;

@Repository
public class TimezoneDAOImpl extends BaseDAOImpl<TimezoneDTO> implements TimezoneDAOInt {

	@Override
	public Class<TimezoneDTO> getDTOClass() {
		return TimezoneDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(TimezoneDTO dto, CriteriaBuilder builder, Root<TimezoneDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<>();

		if (!isEmptyString(dto.getTimezoneCode())) {
			whereCondition.add(builder.equal(qRoot.get("timezoneCode"), dto.getTimezoneCode()));
		}

		if (!isEmptyString(dto.getTimezoneName())) {
			whereCondition.add(builder.like(qRoot.get("timezoneName"), dto.getTimezoneName() + "%"));
		}

		if (!isEmptyString(dto.getOffset())) {
			whereCondition.add(builder.like(qRoot.get("offset"), dto.getOffset() + "%"));
		}

		if (!isEmptyString(dto.getStatus())) {
			whereCondition.add(builder.like(qRoot.get("status"), dto.getStatus() + "%"));
		}

		return whereCondition;
	}
}