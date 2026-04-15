package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.OrganizationDAOInt;
import com.rays.dto.OrganizationDTO;

@Service
@Transactional
public class OrganizationServiceImpl extends BaseServiceImpl<OrganizationDTO, OrganizationDAOInt>
		implements OrganizationServiceInt {

}