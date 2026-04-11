package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.LoyaltyDAOInt;
import com.rays.dto.LoyaltyDTO;

@Service
@Transactional
public class LoyaltyServiceImpl extends BaseServiceImpl<LoyaltyDTO, LoyaltyDAOInt> implements LoyaltyServiceInt {

}