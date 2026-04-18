package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.APIKeyDTO;
import com.rays.form.APIKeyForm;
import com.rays.service.APIKeyServiceInt;

@RestController
@RequestMapping(value = "APIKey")
public class APIKeyCtl extends BaseCtl<APIKeyDTO, APIKeyForm, APIKeyServiceInt> {

}