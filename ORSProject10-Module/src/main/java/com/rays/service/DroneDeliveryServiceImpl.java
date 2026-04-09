package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.DroneDeliveryDAOInt;
import com.rays.dto.DroneDeliveryDTO;

@Service
@Transactional
public class DroneDeliveryServiceImpl extends BaseServiceImpl<DroneDeliveryDTO, DroneDeliveryDAOInt>
		implements DroneDeliveryServiceInt {

}