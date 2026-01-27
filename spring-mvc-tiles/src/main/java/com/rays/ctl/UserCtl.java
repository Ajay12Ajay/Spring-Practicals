package com.rays.ctl;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
@RequestMapping(value = "/ctl/User")
public class UserCtl {

	@Autowired
	public UserServiceInt service;

	@GetMapping
	public String display(@ModelAttribute("form") UserForm form, @RequestParam(required = false) Long id) {
		if (id != null && id > 0) {
			UserDTO dto = service.findByPk(id);
			form.setId(dto.getId());
			form.setFirstName(dto.getFirstName());
			form.setLastName(dto.getLastName());
			form.setLogin(dto.getLogin());
			form.setPassword(dto.getPassword());
			form.setDob(DataUtility.dateToString(dto.getDob()));
			form.setAddress(dto.getAddress());
		}

		return "User";
	}

	@PostMapping
	public String submit(@ModelAttribute("form") @Valid UserForm form, BindingResult bindingResult, HttpSession session,
			Model model) {

		if (bindingResult.hasErrors()) {
			return "User";
		}

		UserDTO dto = new UserDTO();
		dto.setId(form.getId());
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

		form.setPageNo(pageNo);

		return "UserList";

	}

	@PostMapping("search")
	public String submitUserList(@ModelAttribute("form") UserForm form,
			@RequestParam(required = false) String operation, Model model) {

		int pageNo = 1;
		int pageSize = 5;

		UserDTO dto = null;

		if (operation.equals("search")) {
			dto = new UserDTO();
			dto.setId(form.getId());
			dto.setFirstName(form.getFirstName());
		}

		if (operation.equals("add")) {
			return "redirect:/User";
		}

		if (operation.equals("previous")) {
			pageNo = form.getPageNo();
			pageNo--;

		}

		if (operation.equals("next")) {

			pageNo = form.getPageNo();

			pageNo++;
		}

		if (operation.equals("delete")) {

			if (form.getIds() != null && form.getIds().length > 0) {
				for (long id : form.getIds()) {
					service.delete(id);
				}
			}

		}

		form.setPageNo(pageNo);

		List list = service.search(dto, pageNo, pageSize);

		model.addAttribute("list", list);

		return "UserList";

	}

}
