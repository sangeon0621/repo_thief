	package com.maple.infra.test.classcg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClassCGController {

	@Autowired
	ClassCGService classCGService;
	
	@RequestMapping(value = "/infra/classCG/classCGList")
	public String classCGList(Model model) {
		model.addAttribute("list4", classCGService.selectList4());
		return "/v1/infra/classCG/classCGList";
	}
	
	@RequestMapping(value = "/infra/classCG/classCGForm")
	public String classCGForm() {
		return "/v1/infra/classCG/classCGForm";
	}
	
	@RequestMapping(value = "/infra/classCG/classCGInst")
	public String classCGInst(ClassCGDto classCgDto) {
		classCGService.insert4(classCgDto);
		return "redirect:/infra/classCG/classCGList";
	}
	
	@RequestMapping(value = "/infra/classCG/classCGMForm")
	public String classCGMForm(ClassCGDto classCgDto, Model model) {
		model.addAttribute("item", classCGService.selectOne(classCgDto));
		return "/v1/infra/classCG/classCGMForm";
	}
	
	@RequestMapping(value = "/infra/classCG/classCGUpdt")
	public String classCGUpdt(ClassCGDto classCgDto) {
		classCGService.update(classCgDto);
		return "redirect:/infra/classCG/classCGList";
	}
	
}
