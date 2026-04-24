package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.ArchivalPolicyDAOInt;
import com.rays.dto.ArchivalPolicyDTO;

@Service
@Transactional
public class ArchivalPolicyServiceImpl extends BaseServiceImpl<ArchivalPolicyDTO, ArchivalPolicyDAOInt>
		implements ArchivalPolicyServiceInt {

}