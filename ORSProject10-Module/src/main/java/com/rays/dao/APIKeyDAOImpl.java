package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.APIKeyDTO;

@Repository
public class APIKeyDAOImpl extends BaseDAOImpl<APIKeyDTO> implements APIKeyDAOInt {

	@Override
	public Class<APIKeyDTO> getDTOClass() {
		return APIKeyDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(APIKeyDTO dto, CriteriaBuilder builder, Root<APIKeyDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<>();

		if (!isEmptyString(dto.getApiKeyCode())) {
			whereCondition.add(builder.equal(qRoot.get("apiKeyCode"), dto.getApiKeyCode()));
		}

		if (!isEmptyString(dto.getKeyValue())) {
			whereCondition.add(builder.like(qRoot.get("keyValue"), dto.getKeyValue() + "%"));
		}

		if (!isEmptyString(dto.getIssuedTo())) {
			whereCondition.add(builder.like(qRoot.get("issuedTo"), dto.getIssuedTo() + "%"));
		}

		if (!isEmptyString(dto.getStatus())) {
			whereCondition.add(builder.like(qRoot.get("status"), dto.getStatus() + "%"));
		}

		return whereCondition;
	}
}