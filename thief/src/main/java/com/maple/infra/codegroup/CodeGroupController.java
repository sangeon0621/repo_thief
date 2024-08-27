package com.maple.infra.codegroup;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CodeGroupController {
	
	@Autowired
	CodeGroupService codeGroupService;
	
	@RequestMapping(value = "/v1/infra/codeGroup/codeGroupXdmList")
	public String codeGroupXdmList() {
//		여기에서 함수를 호출해야 된다는
//		service 에 있는 함수를 호출
		List<CodeGroupDto> codeGroups = codeGroupService.selectList();
		
		System.out.println("codeGroups.size:" + codeGroups.size());
		
		for(CodeGroupDto codegroupdto : codeGroups  ) {
			System.out.println(codegroupdto.getIfcgSeq() + "|" + codegroupdto.getIfcgName() + "|" + codegroupdto.getDelNy());
		}
		
		return "/xdm/v1/infra/codegroup/codeGroupXdmList";
	}
	
	@RequestMapping(value = "/v1/infra/codeGroup/list")
	public String list() {
		return "/xdm/v1/infra/codegroup/list";
	}
		
	@RequestMapping(value = "/v1/infra/codeGroup/form")
	public String form() {
		return "/xdm/v1/infra/codegroup/form";
	}
	
}
