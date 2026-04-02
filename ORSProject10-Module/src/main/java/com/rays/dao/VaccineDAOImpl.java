package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.VaccineDTO;

@Repository
public class VaccineDAOImpl extends BaseDAOImpl<VaccineDTO> implements VaccineDAOInt {

	@Override
	public Class<VaccineDTO> getDTOClass() {
		return VaccineDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(VaccineDTO dto, CriteriaBuilder builder, Root<VaccineDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<>();

		if (!isEmptyString(dto.getVaccineId())) {
			whereCondition.add(builder.equal(qRoot.get("vaccineId"), dto.getVaccineId()));
		}

		if (!isEmptyString(dto.getVaccineName())) {
			whereCondition.add(builder.like(qRoot.get("vaccineName"), dto.getVaccineName() + "%"));
		}

		if (!isEmptyString(dto.getManufacturer())) {
			whereCondition.add(builder.like(qRoot.get("manufacturer"), dto.getManufacturer() + "%"));
		}

		if (isNotNull(dto.getExpiryDate())) {
			whereCondition.add(builder.equal(qRoot.get("expiryDate"), dto.getExpiryDate()));
		}

		return whereCondition;
	}
}