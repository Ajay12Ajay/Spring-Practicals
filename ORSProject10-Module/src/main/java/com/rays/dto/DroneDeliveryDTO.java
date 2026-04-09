package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_dronedelivery")
public class DroneDeliveryDTO extends BaseDTO {

	@Column(name = "droneId", length = 50, unique = true)
	private String droneId;

	@Column(name = "deliveryZone", length = 100)
	private String deliveryZone;

	@Column(name = "payloadWeight")
	private Double payloadWeight;

	@Column(name = "flightStatus", length = 50)
	private String flightStatus;

	// Getters & Setters

	public String getDroneId() {
		return droneId;
	}

	public void setDroneId(String droneId) {
		this.droneId = droneId;
	}

	public String getDeliveryZone() {
		return deliveryZone;
	}

	public void setDeliveryZone(String deliveryZone) {
		this.deliveryZone = deliveryZone;
	}

	public Double getPayloadWeight() {
		return payloadWeight;
	}

	public void setPayloadWeight(Double payloadWeight) {
		this.payloadWeight = payloadWeight;
	}

	public String getFlightStatus() {
		return flightStatus;
	}

	public void setFlightStatus(String flightStatus) {
		this.flightStatus = flightStatus;
	}

	// BaseDTO methods

	@Override
	public String getValue() {
		return deliveryZone;
	}

	@Override
	public String getUniqueKey() {
		return "droneId";
	}

	@Override
	public String getUniqueValue() {
		return droneId;
	}

	@Override
	public String getLabel() {
		return "droneId";
	}

	@Override
	public String getTableName() {
		return "DroneDelivery";
	}
}