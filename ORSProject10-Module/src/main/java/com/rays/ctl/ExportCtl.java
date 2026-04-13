package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.ExportDTO;
import com.rays.form.ExportForm;
import com.rays.service.ExportServiceInt;

@RestController
@RequestMapping(value = "Export")
public class ExportCtl extends BaseCtl<ExportDTO, ExportForm, ExportServiceInt> {

}