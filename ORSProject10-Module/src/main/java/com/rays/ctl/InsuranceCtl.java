package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.InsuranceDTO;
import com.rays.form.InsuranceForm;
import com.rays.service.InsuranceServiceInt;

@RestController
@RequestMapping(value = "Insurance")
public class InsuranceCtl extends BaseCtl<InsuranceDTO, InsuranceForm, InsuranceServiceInt> {

}