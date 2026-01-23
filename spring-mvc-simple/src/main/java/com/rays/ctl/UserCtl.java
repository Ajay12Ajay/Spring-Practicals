package com.rays.ctl;

import java.util.List;

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
import com.rays.form.UserForm;
import com.rays.service.UserServiceInt;
import com.rays.util.DataUtility;

@Controller
@RequestMapping(value = "User")
public class UserCtl {

	@Autowired
	public UserServiceInt service = null;

	@GetMapping
	public String display(@ModelAttribute("form") UserForm form) {

		return "User";
	}

	@PostMapping
	public String submit(@ModelAttribute("form") UserForm form, HttpSession session, Model model) {

		UserDTO dto = new UserDTO();
		dto.setFirstName(form.getFirstName());
		dto.setLastName(form.getLastName());
		dto.setLogin(form.getLogin());
		dto.setPassword(form.getPassword());
		dto.setDob(DataUtility.stringToDate(form.getDob()));
		dto.setAddress(form.getAddress());

		if (form.getId() > 0) {
			service.update(dto);
			model.addAttribute("success", "Record added successfully");
		} else {
			service.add(dto);
			model.addAttribute("success", "Record updated successfully");
		}

		return "User";

	}

	@GetMapping("search")
	public String displayUserList(@ModelAttribute("form") UserForm form, Model model) {

		int pageNo = 1;
		int pageSize = 5;
		List list = service.search(null, pageNo, pageSize);

		model.addAttribute("list", list);

		return "UserList";

	}

	@PostMapping("search")
	public String submitUserList(@ModelAttribute("form") UserForm form,
			@RequestParam(required = false) String operation, Model model) {

		UserDTO dto = new UserDTO();

		if (operation.equals("search")) {
			dto.setFirstName(form.getFirstName());
		}

		int pageNo = 1;
		int pageSize = 5;
		List list = service.search(dto, pageNo, pageSize);

		model.addAttribute("list", list);

		return "UserList";

	}

}
