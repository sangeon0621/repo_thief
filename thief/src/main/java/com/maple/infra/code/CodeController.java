package com.maple.infra.code;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CodeController {
	
	@Autowired
	CodeService codeService;
	
	@RequestMapping(value = "/v1/infra/code/codeXdmList")
	public String codeXdmList() {
		List<CodeDto> codeDto = codeService.selectList2();
		
		System.out.println("codeDto.size(): " + codeDto.size());
		for(CodeDto code : codeDto) {
			System.out.println(code.getIfcdSeq() + " | " + code.getIfcdName() + " | " + code.getIfcdDelNy() + " | " + code.getCodegroup_ifcgSeq());
		}
		return "/xdm/v1/infra/code/codeXdmList";
	}
	
}
