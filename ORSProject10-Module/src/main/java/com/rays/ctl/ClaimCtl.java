package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.ClaimDTO;
import com.rays.form.ClaimForm;
import com.rays.service.ClaimServiceInt;

@RestController
@RequestMapping(value = "Claim")
public class ClaimCtl extends BaseCtl<ClaimDTO, ClaimForm, ClaimServiceInt> {

}