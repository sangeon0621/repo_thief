package com.maple.infra.test.classcd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClassCdController {

	@Autowired
	ClassCdService classCdService;
	
	@RequestMapping(value = "/infra/classCd/classCd")
	public String classCd() {
		List<ClassCdDto> classCdDto = classCdService.selectList5();
		for(ClassCdDto classCdDtos : classCdDto) {
			System.out.println(classCdDtos.getIfccdEdu());
		}
		return "/v1/infra/classCd/classCd";
	}
	
}
