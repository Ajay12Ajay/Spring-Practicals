package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.RatingDAOInt;
import com.rays.dto.RatingDTO;

@Service
@Transactional
public class RatingServiceImpl extends BaseServiceImpl<RatingDTO, RatingDAOInt> implements RatingServiceInt {

}