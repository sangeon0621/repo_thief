package com.maple.infra.test.classcg;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClassController {
	
	@Autowired
	ClassCGService classCGService;
	
	@RequestMapping(value = "/infra/classCG/classCG")
	public String classCG() {
		List<ClassCGDto> classCGDto = classCGService.selectList4();
		for(ClassCGDto classCGDtos : classCGDto) {
			System.out.println(classCGDtos.getIfccgName());
		}
		return "/v1/infra/classCG/classCG";
	}
	
}
