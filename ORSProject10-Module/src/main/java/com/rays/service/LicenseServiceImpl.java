package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.LicenseDAOInt;
import com.rays.dto.LicenseDTO;

@Service
@Transactional
public class LicenseServiceImpl extends BaseServiceImpl<LicenseDTO, LicenseDAOInt> implements LicenseServiceInt {

}