package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.APIKeyDAOInt;
import com.rays.dto.APIKeyDTO;

@Service
@Transactional
public class APIKeyServiceImpl extends BaseServiceImpl<APIKeyDTO, APIKeyDAOInt> implements APIKeyServiceInt {

}