package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.DroneDeliveryDTO;

public class DroneDeliveryForm extends BaseForm {

	@NotEmpty(message = "droneId is required")
	private String droneId;

	@NotEmpty(message = "deliveryZone is required")
	private String deliveryZone;

	@NotNull(message = "payloadWeight is required")
	private Double payloadWeight;

	@NotEmpty(message = "flightStatus is required")
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

	@Override
	public BaseDTO getDto() {

		DroneDeliveryDTO dto = initDTO(new DroneDeliveryDTO());

		dto.setDroneId(droneId);
		dto.setDeliveryZone(deliveryZone);
		dto.setPayloadWeight(payloadWeight);
		dto.setFlightStatus(flightStatus);

		return dto;
	}
}