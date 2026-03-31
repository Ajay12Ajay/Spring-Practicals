package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.PressReleaseDTO;
import com.rays.form.PressReleaseForm;
import com.rays.service.PressReleaseServiceInt;

@RestController
@RequestMapping(value = "PressRelease")
public class PressReleaseCtl extends BaseCtl<PressReleaseDTO, PressReleaseForm, PressReleaseServiceInt> {

}