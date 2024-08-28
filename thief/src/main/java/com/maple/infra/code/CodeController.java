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
		List<CodeDto> codes = codeService.selectList2();
		
		for(CodeDto codeDto : codes) {
			System.out.println(codeDto.getIfcdName());
		}
		
		return "/xdm/v1/infra/code/codeXdmList";
	}
	
}
