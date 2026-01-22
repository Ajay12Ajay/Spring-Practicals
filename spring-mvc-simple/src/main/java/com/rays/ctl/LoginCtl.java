package com.rays.ctl;

import java.security.Provider.Service;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rays.dto.UserDTO;
import com.rays.form.LoginForm;
import com.rays.service.UserServiceInt;

@Controller
@RequestMapping(value = "Login")
public class LoginCtl {

	@Autowired
	public UserServiceInt service;

	@GetMapping
	public String display(@ModelAttribute("form") LoginForm form, @RequestParam(required = false) String operation,
			HttpSession session, Model model) {
		if (operation != null && operation.equals("logout")) {
			session.invalidate();
			model.addAttribute("msg", "User logout Successfully");
			return "redirect:Welcome";
		}
		return "Login";
	}

	@PostMapping
	public String submit(@ModelAttribute("form") LoginForm form, @RequestParam(required = false) String operation,
			HttpSession session, Model model) {

		UserDTO dto = new UserDTO();
		dto.setLogin(form.getLogin());
		dto.setPassword(form.getPassword());

		dto = service.authenticate(dto.getLogin(), dto.getPassword());
		if (dto != null) {
			session.setAttribute("user", dto);
			// model.addAttribute("success", "User logged successfully");
			return "redirect:Welcome";
		} else {
			model.addAttribute("error", "Invalid User ID PW");
			return "Login";
		}

	}

}
