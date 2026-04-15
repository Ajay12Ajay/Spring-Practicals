package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.OrganizationDTO;

@Repository
public class OrganizationDAOImpl extends BaseDAOImpl<OrganizationDTO> implements OrganizationDAOInt {

	@Override
	public Class<OrganizationDTO> getDTOClass() {
		return OrganizationDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(OrganizationDTO dto, CriteriaBuilder builder,
			Root<OrganizationDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<>();

		if (!isEmptyString(dto.getOrganizationCode())) {
			whereCondition.add(builder.equal(qRoot.get("organizationCode"), dto.getOrganizationCode()));
		}

		if (!isEmptyString(dto.getOrganizationName())) {
			whereCondition.add(builder.like(qRoot.get("organizationName"), dto.getOrganizationName() + "%"));
		}

		if (!isEmptyString(dto.getAddress())) {
			whereCondition.add(builder.like(qRoot.get("address"), dto.getAddress() + "%"));
		}

		if (!isEmptyString(dto.getStatus())) {
			whereCondition.add(builder.like(qRoot.get("status"), dto.getStatus() + "%"));
		}

		return whereCondition;
	}
}