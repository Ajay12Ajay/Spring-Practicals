package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.PaymentMethodDAOInt;
import com.rays.dto.PaymentMethodDTO;

@Service
@Transactional
public class PaymentMethodServiceImpl extends BaseServiceImpl<PaymentMethodDTO, PaymentMethodDAOInt>
		implements PaymentMethodServiceInt {

}