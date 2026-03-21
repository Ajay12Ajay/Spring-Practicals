package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.RatingDTO;
import com.rays.form.RatingForm;
import com.rays.service.RatingServiceInt;

@RestController
@RequestMapping(value = "Rating")
public class RatingCtl extends BaseCtl<RatingDTO, RatingForm, RatingServiceInt> {

}