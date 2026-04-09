package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.DroneDeliveryDTO;

@Repository
public class DroneDeliveryDAOImpl extends BaseDAOImpl<DroneDeliveryDTO> implements DroneDeliveryDAOInt {

	@Override
	public Class<DroneDeliveryDTO> getDTOClass() {
		return DroneDeliveryDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(DroneDeliveryDTO dto, CriteriaBuilder builder,
			Root<DroneDeliveryDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<>();

		if (!isEmptyString(dto.getDroneId())) {
			whereCondition.add(builder.equal(qRoot.get("droneId"), dto.getDroneId()));
		}

		if (!isEmptyString(dto.getDeliveryZone())) {
			whereCondition.add(builder.like(qRoot.get("deliveryZone"), dto.getDeliveryZone() + "%"));
		}

		if (dto.getPayloadWeight() != null) {
			whereCondition.add(builder.equal(qRoot.get("payloadWeight"), dto.getPayloadWeight()));
		}

		if (!isEmptyString(dto.getFlightStatus())) {
			whereCondition.add(builder.like(qRoot.get("flightStatus"), dto.getFlightStatus() + "%"));
		}

		return whereCondition;
	}
}