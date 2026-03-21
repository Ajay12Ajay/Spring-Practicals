package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.LicenseDTO;
import com.rays.form.LicenseForm;
import com.rays.service.LicenseServiceInt;

@RestController
@RequestMapping(value = "License")
public class LicenseCtl extends BaseCtl<LicenseDTO, LicenseForm, LicenseServiceInt> {

}