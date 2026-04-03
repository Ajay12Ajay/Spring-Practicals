package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.PromissoryDTO;

@Repository
public class PromissoryDAOImpl extends BaseDAOImpl<PromissoryDTO> implements PromissoryDAOInt {

	@Override
	public Class<PromissoryDTO> getDTOClass() {
		return PromissoryDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(PromissoryDTO dto, CriteriaBuilder builder, Root<PromissoryDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<>();

		if (!isEmptyString(dto.getPromissoryNoteId())) {
			whereCondition.add(builder.equal(qRoot.get("promissoryNoteId"), dto.getPromissoryNoteId()));
		}

		if (!isEmptyString(dto.getPayeeName())) {
			whereCondition.add(builder.like(qRoot.get("payeeName"), dto.getPayeeName() + "%"));
		}

		if (dto.getFaceAmount() != null) {
			whereCondition.add(builder.equal(qRoot.get("faceAmount"), dto.getFaceAmount()));
		}

		if (isNotNull(dto.getIssueDate())) {
			whereCondition.add(builder.equal(qRoot.get("issueDate"), dto.getIssueDate()));
		}

		if (!isEmptyString(dto.getStatus())) {
			whereCondition.add(builder.like(qRoot.get("status"), dto.getStatus() + "%"));
		}

		return whereCondition;
	}
}