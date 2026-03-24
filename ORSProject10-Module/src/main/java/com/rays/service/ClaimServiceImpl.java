package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.ClaimDAOInt;
import com.rays.dto.ClaimDTO;

@Service
@Transactional
public class ClaimServiceImpl extends BaseServiceImpl<ClaimDTO, ClaimDAOInt> implements ClaimServiceInt {

}