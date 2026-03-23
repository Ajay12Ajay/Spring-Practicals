package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.HostelRoomAllocationDTO;
import com.rays.form.HostelRoomAllocationForm;
import com.rays.service.HostelRoomAllocationServiceInt;

@RestController
@RequestMapping(value = "HostelRoomAllocation")
public class HostelRoomAllocationCtl extends BaseCtl<HostelRoomAllocationDTO, HostelRoomAllocationForm, HostelRoomAllocationServiceInt> {

}