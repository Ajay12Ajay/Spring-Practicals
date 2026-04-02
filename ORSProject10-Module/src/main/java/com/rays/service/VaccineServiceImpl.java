package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.VaccineDAOInt;
import com.rays.dto.VaccineDTO;

@Service
@Transactional
public class VaccineServiceImpl extends BaseServiceImpl<VaccineDTO, VaccineDAOInt> implements VaccineServiceInt {

}