package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.QuotaDAOInt;
import com.rays.dto.QuotaDTO;

@Service
@Transactional
public class QuotaServiceImpl extends BaseServiceImpl<QuotaDTO, QuotaDAOInt> implements QuotaServiceInt {

}