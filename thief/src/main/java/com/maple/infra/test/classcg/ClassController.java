package com.maple.infra.test.classcg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClassController {
	
	@Autowired
	ClassCGService classCGService;
	
	@RequestMapping(value = "/infra/classCG/classCG")
	public String classCG(Model model) {
		model.addAttribute("list4", classCGService.selectList4());
		return "/v1/infra/classCG/classCG";
	}
	
	@RequestMapping(value = "/infra/classCG/classCGForm")
	public String classCGForm() {
		return "/v1/infra/classCG/classCGForm";
	}
	
	@RequestMapping(value = "/infra/classCG/classCGInst")
	public String classCGInst(ClassCGDto classCgDto) {
		classCGService.insert4(classCgDto);
		return "redirect:/v1/infra/classCG/classCG";
	}
	
	@RequestMapping(value = "/infra/classCG/classCGMForm")
	public String classCGMForm() {
		return "/v1/infra/classCG/classCGMForm";
	}
	
}
