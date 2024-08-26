package com.maple.infra.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CodeController {
	
	@Autowired
	CodeService service;
	
	@RequestMapping(value = "/v1/infra/code/codeXdmList")
	public String codeXdmList() {
		service.codeService();
		return "/xdm/v1/infra/code/codeXdmList";
	}
	
}
