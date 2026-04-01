package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.EMIDTO;
import com.rays.form.EMIForm;
import com.rays.service.EMIServiceInt;

@RestController
@RequestMapping(value = "EMI")
public class EMICtl extends BaseCtl<EMIDTO, EMIForm, EMIServiceInt> {

}