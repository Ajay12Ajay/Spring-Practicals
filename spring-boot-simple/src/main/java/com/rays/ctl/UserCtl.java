package com.rays.ctl;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.RoleDTO;
import com.rays.dto.UserDTO;
import com.rays.form.RoleForm;
import com.rays.form.UserFrom;
import com.rays.service.UserService;

@RestController
@RequestMapping(value = "User")
public class UserCtl extends BaseCtl {

	@Autowired
	UserService service;

	@PostMapping("save")
	public ORSResponse save(@RequestBody @Valid UserFrom form, BindingResult bindingResult) {

		ORSResponse res = new ORSResponse();

		res = validate(bindingResult);

		if (res.isSuccess() == false) {
			return res;
		}

		UserDTO dto = new UserDTO();

		dto = (UserDTO) form.getDto();

		long i = service.add(dto);

		if (i != 0) {
			res.setSuccess(true);
			res.addMessage("role Added Successfully");
			res.addData(dto);
		}

		return res;

	}

	@PostMapping("update")
	public ORSResponse update(@RequestBody @Valid UserFrom form, BindingResult bindingResult) {

		ORSResponse res = new ORSResponse();

		res = validate(bindingResult);

		if (res.isSuccess() == false) {
			return res;
		}

		UserDTO dto = (UserDTO) form.getDto();
		if (dto.getId() != null && dto.getId() > 0) {
			service.update(dto);
			res.addData(dto);
			res.addMessage("Data Updated Successfull...");
			res.setSuccess(true);
		} else {
			System.out.println("Data Not updated");
		}
		return res;

	}

}
