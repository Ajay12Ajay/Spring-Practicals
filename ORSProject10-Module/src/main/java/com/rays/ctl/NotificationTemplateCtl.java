package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.NotificationTemplateDTO;
import com.rays.form.NotificationTemplateForm;
import com.rays.service.NotificationTemplateServiceInt;

@RestController
@RequestMapping(value = "Notification")
public class NotificationTemplateCtl
		extends BaseCtl<NotificationTemplateDTO, NotificationTemplateForm, NotificationTemplateServiceInt> {

}