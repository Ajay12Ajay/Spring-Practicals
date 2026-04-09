package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.DroneDeliveryDTO;
import com.rays.form.DroneDeliveryForm;
import com.rays.service.DroneDeliveryServiceInt;

@RestController
@RequestMapping(value = "DroneDelivery")
public class DroneDeliveryCtl extends BaseCtl<DroneDeliveryDTO, DroneDeliveryForm, DroneDeliveryServiceInt> {

}