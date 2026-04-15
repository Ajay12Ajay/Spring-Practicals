package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.PaymentMethodDTO;

@Repository
public class PaymentMethodDAOImpl extends BaseDAOImpl<PaymentMethodDTO> implements PaymentMethodDAOInt {

	@Override
	public Class<PaymentMethodDTO> getDTOClass() {
		return PaymentMethodDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(PaymentMethodDTO dto, CriteriaBuilder builder,
			Root<PaymentMethodDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<>();

		if (!isEmptyString(dto.getMethodCode())) {
			whereCondition.add(builder.equal(qRoot.get("methodCode"), dto.getMethodCode()));
		}

		if (!isEmptyString(dto.getMethodName())) {
			whereCondition.add(builder.like(qRoot.get("methodName"), dto.getMethodName() + "%"));
		}

		if (!isEmptyString(dto.getProvider())) {
			whereCondition.add(builder.like(qRoot.get("provider"), dto.getProvider() + "%"));
		}

		if (!isEmptyString(dto.getStatus())) {
			whereCondition.add(builder.like(qRoot.get("status"), dto.getStatus() + "%"));
		}

		return whereCondition;
	}
}