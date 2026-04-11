package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.NotificationTemplateDTO;

@Repository
public class NotificationTemplateDAOImpl extends BaseDAOImpl<NotificationTemplateDTO>
		implements NotificationTemplateDAOInt {

	@Override
	public Class<NotificationTemplateDTO> getDTOClass() {
		return NotificationTemplateDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(NotificationTemplateDTO dto, CriteriaBuilder builder,
			Root<NotificationTemplateDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<>();

		if (!isEmptyString(dto.getTemplateCode())) {
			whereCondition.add(builder.equal(qRoot.get("templateCode"), dto.getTemplateCode()));
		}

		if (!isEmptyString(dto.getTitle())) {
			whereCondition.add(builder.like(qRoot.get("title"), dto.getTitle() + "%"));
		}

		if (!isEmptyString(dto.getContent())) {
			whereCondition.add(builder.like(qRoot.get("content"), dto.getContent() + "%"));
		}

		if (!isEmptyString(dto.getStatus())) {
			whereCondition.add(builder.like(qRoot.get("status"), dto.getStatus() + "%"));
		}

		return whereCondition;
	}
}