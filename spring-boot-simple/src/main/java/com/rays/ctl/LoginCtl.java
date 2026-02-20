package com.rays.ctl;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.UserDTO;
import com.rays.form.LoginForm;
import com.rays.form.UserFrom;
import com.rays.form.UserRegistrationForm;
import com.rays.service.UserService;

@RestController
@RequestMapping(value = "auth")
public class LoginCtl extends BaseCtl {

	@Autowired
	UserService service;

	@PostMapping("signup")
	public ORSResponse save(@RequestBody @Valid UserRegistrationForm form, BindingResult bindingResult) {

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
			res.addMessage("User Added Successfully");
			res.addData(dto);
		}

		return res;

	}

	@PostMapping("login")
	public ORSResponse login(@RequestBody @Valid LoginForm form, BindingResult bindingResult, HttpSession session) {

		ORSResponse res = new ORSResponse();

		res = validate(bindingResult);

		if (!res.isSuccess()) {
			return res;
		}

		UserDTO dto = service.authenticate(form.getLogin(), form.getPassword());

		if (dto != null) {
			session.setAttribute("user", dto);
			res.setSuccess(true);
			res.addMessage("user Login Successful....");
			res.addData(dto);
		} else {
			res.setSuccess(false);
			res.addMessage("Invaid login and password");
		}

		return res;

	}

	@PostMapping("logout")
	public ORSResponse logout(HttpSession session) {

		ORSResponse res = new ORSResponse();

		session.invalidate();

		res.addMessage("Logout successfully...");
		return res;

	}

}
