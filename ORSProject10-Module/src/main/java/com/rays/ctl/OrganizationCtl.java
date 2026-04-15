package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.OrganizationDTO;
import com.rays.form.OrganizationForm;
import com.rays.service.OrganizationServiceInt;

@RestController
@RequestMapping(value = "Organization")
public class OrganizationCtl extends BaseCtl<OrganizationDTO, OrganizationForm, OrganizationServiceInt> {

}