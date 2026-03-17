package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.common.BaseServiceInt;
import com.rays.dao.BookingDAOInt;
import com.rays.dto.BookingDTO;

@Service
@Transactional
public class BookingServiceImpl extends BaseServiceImpl<BookingDTO, BookingDAOInt> implements BookingServiceInt {

}
