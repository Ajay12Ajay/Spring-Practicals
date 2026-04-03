package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.PromissoryDAOInt;
import com.rays.dto.PromissoryDTO;

@Service
@Transactional
public class PromissoryServiceImpl extends BaseServiceImpl<PromissoryDTO, PromissoryDAOInt>
		implements PromissoryServiceInt {

}