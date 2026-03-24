package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.ClaimDTO;

@Repository
public class ClaimDAOImpl extends BaseDAOImpl<ClaimDTO> implements ClaimDAOInt {

	@Override
	public Class<ClaimDTO> getDTOClass() {
		return ClaimDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(ClaimDTO dto, CriteriaBuilder builder, Root<ClaimDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<>();

		if (!isEmptyString(dto.getClaimNumber())) {
			whereCondition.add(builder.equal(qRoot.get("claimNumber"), dto.getClaimNumber()));
		}

		if (dto.getClaimAmount() != null) {
			whereCondition.add(builder.equal(qRoot.get("claimAmount"), dto.getClaimAmount()));
		}

		if (!isEmptyString(dto.getStatus())) {
			whereCondition.add(builder.like(qRoot.get("status"), dto.getStatus() + "%"));
		}

		return whereCondition;
	}
}