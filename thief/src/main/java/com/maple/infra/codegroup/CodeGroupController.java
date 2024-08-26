package com.maple.infra.codegroup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CodeGroupController {
	
//	CodeGroupService codegroupservice = new CodeGroupService();
	@Autowired
	CodeGroupService service;
	
	@RequestMapping(value = "/v1/infra/codeGroup/codeGroupXdmList")
	public String codeGroupXdmList() {
//		여기에서 함수를 호출해야 된다는
//		service 에 있는 함수를 호출
		service.selectList();
		return "/xdm/v1/infra/codegroup/codeGroupXdmList";
	}
	
	@RequestMapping(value = "/v1/infra/codeGroup/list")
	public String ilst() {
		return "/xdm/v1/infra/codegroup/list";
	}
		
	@RequestMapping(value = "/v1/infra/codeGroup/form")
	public String form() {
		return "/xdm/v1/infra/codegroup/form";
	}
	
}
