package com.rays.ctl;

import java.io.OutputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.rays.common.BaseCtl;
import com.rays.common.DropDownList;
import com.rays.common.ORSResponse;
import com.rays.dto.AttachmentDTO;
import com.rays.dto.RoleDTO;
import com.rays.dto.UserDTO;
import com.rays.form.RoleForm;
import com.rays.form.UserFrom;
import com.rays.service.AttachmentService;
import com.rays.service.RoleService;
import com.rays.service.UserService;

@RestController
@RequestMapping(value = "User")
public class UserCtl extends BaseCtl {

	@Autowired
	UserService service;

	@Autowired
	RoleService roleService;

	@Autowired
	AttachmentService attchService;

	@GetMapping("preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse();

		List<DropDownList> roleList = roleService.search(null, 0, 0);
		res.setSuccess(true);
		res.addResult("roleList", roleList);
		return res;
	}

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

	@PostMapping("delete/{ids}")
	public ORSResponse delete(@PathVariable(required = false) long[] ids) {

		ORSResponse res = new ORSResponse();

		if (ids != null && ids.length > 0) {
			for (long id : ids) {
				service.delete(id);
			}
			res.setSuccess(true);
			res.addMessage("record deleted successfully");
		} else {
			res.addMessage("select at least one record");
		}

		return res;
	}

	@GetMapping("get/{id}")
	public ORSResponse get(@PathVariable Long id) {

		ORSResponse res = new ORSResponse();
		UserDTO dto = service.findById(id);

		if (dto != null) {
			res.addData(dto);
			res.setSuccess(true);
		}

		res.addData(dto);
		return res;
	}

	@RequestMapping(value = "search/{pageNo}", method = { RequestMethod.GET, RequestMethod.POST })
	public ORSResponse search(@RequestBody(required = false) UserFrom form, @PathVariable int pageNo) {

		ORSResponse res = new ORSResponse();

		UserDTO dto = null;

		int pageSize = 5;

		if (form != null) {
			dto = (UserDTO) form.getDto();
		}

		List<UserDTO> list = service.search(dto, pageNo, pageSize);

		if (list.size() == 0) {
			res.addMessage("Result not Found");
		} else {
			res.setSuccess(true);
			res.addData(list);
		}

		return res;

	}

	@PostMapping("profilePic/{userId}")
	public ORSResponse uploadPic(@PathVariable Long userId, @RequestParam("file") MultipartFile file,
			HttpServletRequest request) {

		AttachmentDTO attachmentDto = new AttachmentDTO(file);
		attachmentDto.setDescription("profilePic");
		attachmentDto.setUserId(userId);

		UserDTO userDto = service.findById(userId);

		if (userDto.getImageId() != null && userDto.getImageId() > 0) {
			attachmentDto.setId(userDto.getImageId());
		}

		Long imageId = attchService.save(attachmentDto);

		if (userDto.getImageId() == null) {
			userDto.setImageId(imageId);
			service.update(userDto);
		}

		ORSResponse res = new ORSResponse();
		res.addResult("imageId", imageId);
		res.setSuccess(true);

		return res;
	}

	@GetMapping("profilePic/{userId}")
	public @ResponseBody void downloadPic(@PathVariable Long userId, HttpServletResponse response) {
		try {
			UserDTO userDto = service.findById(userId);
			AttachmentDTO attachmentDTO = null;

			if (userDto != null) {
				attachmentDTO = attchService.findByPk(userDto.getImageId());
			}

			if (attachmentDTO != null) {
				response.setContentType(attachmentDTO.getType());
				OutputStream out = response.getOutputStream();
				out.write(attachmentDTO.getDoc());
				out.close();
			} else {
				response.getWriter().write("ERROR: File not found...!");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
