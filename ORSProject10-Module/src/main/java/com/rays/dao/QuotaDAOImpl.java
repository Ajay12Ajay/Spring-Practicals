package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.QuotaDTO;

@Repository
public class QuotaDAOImpl extends BaseDAOImpl<QuotaDTO> implements QuotaDAOInt {

	@Override
	public Class<QuotaDTO> getDTOClass() {
		return QuotaDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(QuotaDTO dto, CriteriaBuilder builder, Root<QuotaDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<>();

		if (!isEmptyString(dto.getQuotaCode())) {
			whereCondition.add(builder.equal(qRoot.get("quotaCode"), dto.getQuotaCode()));
		}

		if (!isEmptyString(dto.getUserName())) {
			whereCondition.add(builder.like(qRoot.get("userName"), dto.getUserName() + "%"));
		}

		if (dto.getLimitValue() != null) {
			whereCondition.add(builder.equal(qRoot.get("limitValue"), dto.getLimitValue()));
		}

		if (!isEmptyString(dto.getStatus())) {
			whereCondition.add(builder.like(qRoot.get("status"), dto.getStatus() + "%"));
		}

		return whereCondition;
	}
}