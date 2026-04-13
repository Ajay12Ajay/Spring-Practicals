package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.ExportDTO;

@Repository
public class ExportDAOImpl extends BaseDAOImpl<ExportDTO> implements ExportDAOInt {

	@Override
	public Class<ExportDTO> getDTOClass() {
		return ExportDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(ExportDTO dto, CriteriaBuilder builder, Root<ExportDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<>();

		if (!isEmptyString(dto.getExportCode())) {
			whereCondition.add(builder.equal(qRoot.get("exportCode"), dto.getExportCode()));
		}

		if (!isEmptyString(dto.getFileName())) {
			whereCondition.add(builder.like(qRoot.get("fileName"), dto.getFileName() + "%"));
		}

		if (!isEmptyString(dto.getFormat())) {
			whereCondition.add(builder.like(qRoot.get("format"), dto.getFormat() + "%"));
		}

		if (!isEmptyString(dto.getStatus())) {
			whereCondition.add(builder.like(qRoot.get("status"), dto.getStatus() + "%"));
		}

		return whereCondition;
	}
}