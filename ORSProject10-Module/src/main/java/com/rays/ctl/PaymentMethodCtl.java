package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.PaymentMethodDTO;
import com.rays.form.PaymentMethodForm;
import com.rays.service.PaymentMethodServiceInt;

@RestController
@RequestMapping(value = "PaymentMethod")
public class PaymentMethodCtl extends BaseCtl<PaymentMethodDTO, PaymentMethodForm, PaymentMethodServiceInt> {

}