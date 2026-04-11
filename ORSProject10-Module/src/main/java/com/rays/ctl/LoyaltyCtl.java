package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.LoyaltyDTO;
import com.rays.form.LoyaltyForm;
import com.rays.service.LoyaltyServiceInt;

@RestController
@RequestMapping(value = "Loyalty")
public class LoyaltyCtl extends BaseCtl<LoyaltyDTO, LoyaltyForm, LoyaltyServiceInt> {

}