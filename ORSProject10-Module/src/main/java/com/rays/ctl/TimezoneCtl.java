package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.TimezoneDTO;
import com.rays.form.TimezoneForm;
import com.rays.service.TimezoneServiceInt;

@RestController
@RequestMapping(value = "Timezone")
public class TimezoneCtl extends BaseCtl<TimezoneDTO, TimezoneForm, TimezoneServiceInt> {

}