package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.BookingDTO;
import com.rays.form.BookingForm;
import com.rays.service.BookingServiceInt;

@RestController
@RequestMapping(value = "Booking")
public class BookingCtl extends BaseCtl<BookingDTO, BookingForm, BookingServiceInt> {

}
