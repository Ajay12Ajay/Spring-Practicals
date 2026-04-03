package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.PromissoryDTO;
import com.rays.form.PromissoryForm;
import com.rays.service.PromissoryServiceInt;

@RestController
@RequestMapping(value = "Promissory")
public class PromissoryCtl extends BaseCtl<PromissoryDTO, PromissoryForm, PromissoryServiceInt> {

}