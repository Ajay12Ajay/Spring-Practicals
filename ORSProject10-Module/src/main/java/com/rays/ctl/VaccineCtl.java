package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.VaccineDTO;
import com.rays.form.VaccineForm;
import com.rays.service.VaccineServiceInt;

@RestController
@RequestMapping(value = "Vaccine")
public class VaccineCtl extends BaseCtl<VaccineDTO, VaccineForm, VaccineServiceInt> {

}