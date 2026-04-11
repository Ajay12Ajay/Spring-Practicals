package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.LoyaltyDTO;

@Repository
public class LoyaltyDAOImpl extends BaseDAOImpl<LoyaltyDTO> implements LoyaltyDAOInt {

	@Override
	public Class<LoyaltyDTO> getDTOClass() {
		return LoyaltyDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(LoyaltyDTO dto, CriteriaBuilder builder, Root<LoyaltyDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<>();

		if (!isEmptyString(dto.getLoyaltyCode())) {
			whereCondition.add(builder.equal(qRoot.get("loyaltyCode"), dto.getLoyaltyCode()));
		}

		if (!isEmptyString(dto.getUserName())) {
			whereCondition.add(builder.like(qRoot.get("userName"), dto.getUserName() + "%"));
		}

		if (dto.getPoints() != null) {
			whereCondition.add(builder.equal(qRoot.get("points"), dto.getPoints()));
		}

		if (!isEmptyString(dto.getStatus())) {
			whereCondition.add(builder.like(qRoot.get("status"), dto.getStatus() + "%"));
		}

		return whereCondition;
	}
}