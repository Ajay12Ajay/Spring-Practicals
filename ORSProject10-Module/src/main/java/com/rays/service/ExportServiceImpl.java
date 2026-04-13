package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.ExportDAOInt;
import com.rays.dto.ExportDTO;

@Service
@Transactional
public class ExportServiceImpl extends BaseServiceImpl<ExportDTO, ExportDAOInt> implements ExportServiceInt {

}