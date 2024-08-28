package com.maple.infra.codegroup;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class CodeGroupController {
	
	@Autowired
	CodeGroupService codeGroupService;
	
	@RequestMapping(value = "/v1/infra/codegroup/codeGroupXdmList")
	public String codeGroupXdmList() {
		List<CodeGroupDto> codeGroups = codeGroupService.selectList();
		
		for(CodeGroupDto codeGroupDto : codeGroups) {
			System.out.println(codeGroupDto.getIfcgName());
		}
		return "/xdm/v1/infra/codegroup/codeGroupXdmList";
	}
	
	
	
	
}
