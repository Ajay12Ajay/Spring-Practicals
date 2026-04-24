package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.ArchivalPolicyDTO;

@Repository
public class ArchivalPolicyDAOImpl extends BaseDAOImpl<ArchivalPolicyDTO> implements ArchivalPolicyDAOInt {

	@Override
	public Class<ArchivalPolicyDTO> getDTOClass() {
		return ArchivalPolicyDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(ArchivalPolicyDTO dto, CriteriaBuilder builder,
			Root<ArchivalPolicyDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<>();

		if (!isEmptyString(dto.getPolicyCode())) {
			whereCondition.add(builder.equal(qRoot.get("policyCode"), dto.getPolicyCode()));
		}

		if (!isEmptyString(dto.getDataType())) {
			whereCondition.add(builder.like(qRoot.get("dataType"), dto.getDataType() + "%"));
		}

		if (dto.getArchiveAfterDays() != null) {
			whereCondition.add(builder.equal(qRoot.get("archiveAfterDays"), dto.getArchiveAfterDays()));
		}

		if (!isEmptyString(dto.getStatus())) {
			whereCondition.add(builder.like(qRoot.get("status"), dto.getStatus() + "%"));
		}

		return whereCondition;
	}
}