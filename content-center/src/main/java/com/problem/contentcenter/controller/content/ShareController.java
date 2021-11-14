package com.problem.contentcenter.controller.content;

import com.problem.contentcenter.domain.dto.content.ShareDTO;
import com.problem.contentcenter.service.content.ShareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shares")
public class ShareController {

	@Autowired
	private ShareService shareService;

	@GetMapping("/{id}")
	public ShareDTO findShareContent(@PathVariable(value = "id") Integer id) {
		return shareService.findById(id);
	}
}
