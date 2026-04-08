package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.TimezoneDAOInt;
import com.rays.dto.TimezoneDTO;

@Service
@Transactional
public class TimezoneServiceImpl extends BaseServiceImpl<TimezoneDTO, TimezoneDAOInt> implements TimezoneServiceInt {

}