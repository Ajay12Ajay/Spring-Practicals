package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.QuotaDTO;
import com.rays.form.QuotaForm;
import com.rays.service.QuotaServiceInt;

@RestController
@RequestMapping(value = "Quota")
public class QuotaCtl extends BaseCtl<QuotaDTO, QuotaForm, QuotaServiceInt> {

}