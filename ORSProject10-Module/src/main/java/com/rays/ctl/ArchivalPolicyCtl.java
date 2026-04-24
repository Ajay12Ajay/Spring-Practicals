package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.ArchivalPolicyDTO;
import com.rays.form.ArchivalPolicyForm;
import com.rays.service.ArchivalPolicyServiceInt;

@RestController
@RequestMapping(value = "ArchivalPolicy")
public class ArchivalPolicyCtl extends BaseCtl<ArchivalPolicyDTO, ArchivalPolicyForm, ArchivalPolicyServiceInt> {

}