package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.PressReleaseDAOInt;
import com.rays.dto.PressReleaseDTO;

@Service
@Transactional
public class PressReleaseServiceImpl extends BaseServiceImpl<PressReleaseDTO, PressReleaseDAOInt>
		implements PressReleaseServiceInt {

}