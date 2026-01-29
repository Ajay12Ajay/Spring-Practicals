package com.rays.ctl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.ORSResponse;
import com.rays.dto.TestDTO;

@RestController
@RequestMapping(value = "ORS")
public class ORSCtl {

	@GetMapping
	public String display() {
		return "in display method";
	}

	@GetMapping("display1")
	public TestDTO display1() {

		TestDTO dto = new TestDTO();
		dto.setId(1L);
		dto.setFirstName("Ajay");
		dto.setLastName("Kerketta");
		dto.setLoginId("ajay@gmai.com");
		dto.setPassword("123");
		dto.setDob("29-01-2026");

		return dto;
	}

	@GetMapping("display2")
	public ORSResponse display2() {
		ORSResponse res = new ORSResponse();
		return res;
	}

	@GetMapping("display3")
	public ORSResponse display3() {
		ORSResponse res = new ORSResponse();

		Map error = new HashMap<>();
		error.put("firstName", "firstNAme is required");
		error.put("lastName", "lastName is required");
		error.put("loginId", "loginId is required");
		error.put("password", "password is required");

		res.addInputError(error);
		return res;
	}

	@GetMapping("display4")
	public ORSResponse diaplay4() {

		ORSResponse res = new ORSResponse();

		TestDTO dto = new TestDTO();
		dto.setId(1L);
		dto.setFirstName("Ajay");
		dto.setLastName("Kerketta");
		dto.setLoginId("ajay@gmai.com");
		dto.setPassword("123");
		dto.setDob("29-01-2026");

		res.setSuccess(true);
		res.addData(dto);

		return res;

	}

	@GetMapping("display5")
	public ORSResponse diaplay5() {

		ORSResponse res = new ORSResponse();

		TestDTO dto = new TestDTO();
		dto.setId(1L);
		dto.setFirstName("Ajay");
		dto.setLastName("Kerketta");
		dto.setLoginId("ajay@gmail.com");
		dto.setPassword("123");
		dto.setDob("29-01-2026");

		TestDTO dto1 = new TestDTO();
		dto1.setId(2L);
		dto1.setFirstName("Malay");
		dto1.setLastName("Dongre");
		dto1.setLoginId("malay@gmail.com");
		dto1.setPassword("123");
		dto1.setDob("29-01-2026");

		List list = new ArrayList<>();
		list.add(dto);
		list.add(dto1);

		res.setSuccess(true);
		res.addData(list);

		return res;

	}

	@GetMapping("display6")
	public ORSResponse display6() {

		ORSResponse res = new ORSResponse();
		res.addMessage("data Added Successfully");
		res.setSuccess(true);
		return res;

	}

	@GetMapping("display7")
	public ORSResponse display7() {
		ORSResponse res = new ORSResponse();
		res.addResult("Course", "Java,Python");

		return res;
	}

}
