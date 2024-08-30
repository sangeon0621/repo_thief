package com.maple.infra.codegroup;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CodeGroupController {
	
	@Autowired
	CodeGroupService codeGroupService;
	
	@RequestMapping(value = "/v1/infra/codegroup/codeGroupXdmList")
	public String codeGroupXdmList(Model model) {
		
		model.addAttribute("list", codeGroupService.selectList());
		
		return "/xdm/v1/infra/codegroup/codeGroupXdmList";
	}
	
//	@RequestMapping(value = "/v1/infra/codeGroup/codeGroupXdmList")
//	public String codeGroupXdmList(Model model) {
//		List<CodeGroupDto> codeGroups = codeGroupService.selectList();
//		
////		model.addAttribute("list", codeGroups);
//		
//		for(CodeGroupDto codeGroupDto : codeGroups) {
//			System.out.println(codeGroupDto.getRegDatetime());
//		}
//		return "/xdm/v1/infra/codegroup/codeGroupXdmList";
//	}
	
	@RequestMapping(value = "/v1/infra/codegroup/codeGroupXdmForm")
	public String codeGroupXdmForm() {
		
		return "/xdm/v1/infra/codegroup/codeGroupXdmForm";
	}
	
	@RequestMapping(value = "/v1/infra/codegroup/codeGroupXdmInst")
	public String codeGroupXdmInst(CodeGroupDto codeGroupDto) {
		
		System.out.println("codeGroupDto.getIfcgName():" + codeGroupDto.getIfcgName());
		codeGroupService.insert(codeGroupDto);
		
		return "redirect:/v1/infra/codegroup/codeGroupXdmList";
	}
	
	
}
