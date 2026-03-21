package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.InsuranceDAOInt;
import com.rays.dto.InsuranceDTO;

@Service
@Transactional
public class InsuranceServiceImpl extends BaseServiceImpl<InsuranceDTO, InsuranceDAOInt>
		implements InsuranceServiceInt {

}