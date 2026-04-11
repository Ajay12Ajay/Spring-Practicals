package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.NotificationTemplateDAOInt;
import com.rays.dto.NotificationTemplateDTO;

@Service
@Transactional
public class NotificationTemplateServiceImpl extends
		BaseServiceImpl<NotificationTemplateDTO, NotificationTemplateDAOInt> implements NotificationTemplateServiceInt {

}