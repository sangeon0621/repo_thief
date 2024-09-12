package com.maple.infra.code;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CodeController {

	@Autowired
	CodeService codeService;
	
	@RequestMapping(value = "/v1/infra/code/codeXdmList")
	public String codeXdmList(CodeVo vo, Model model) {
		vo.setShDateStart(vo.getShDateStart() + "00:00:00");
		vo.setShDateEnd(vo.getShDateEnd() + "00:00:00");
		
		model.addAttribute("list", codeService.selectList2(vo));
		
		return "/xdm/v1/infra/code/codeXdmList";
	}
	
//	@RequestMapping(value = "/v1/infra/code/codeXdmList")
//	public String codeXdmList() {
//		List<CodeDto> codes = codeService.selectList2();
//		
//		for(CodeDto codeDto : codes) {
//			System.out.println(codeDto.getCodeGroup_ifcgSeq() + codeDto.getIfcdName());
//		}
//		
//		return "/xdm/v1/infra/code/codeXdmList";
//	}
	
	@RequestMapping(value = "/v1/infra/code/codeXdmForm")
	public String codeXdmForm(Model model) {
		
		model.addAttribute("listCodeGroup", codeService.selectListCodeGroup());
		
		return "/xdm/v1/infra/code/codeXdmForm";
	}
	
	@RequestMapping(value = "v1/infra/code/codeXdmInst")
	public String codeXdmInst(CodeDto codeDto) {
		codeService.insert(codeDto);
		return "redirect:/v1/infra/code/codeXdmList";
	}
	
	@RequestMapping(value = "/v1/infra/code/codeXdmMForm")
	public String codeXdmMForm(CodeDto codeDto, Model model) {
		model.addAttribute("item", codeService.selectOne(codeDto));
		return "/xdm/v1/infra/code/codeXdmMForm";
	}
	
	@RequestMapping(value = "/v1/infra/code/codeXdmUpdt")
	public String codeXdmUpdt(CodeDto codeDto) {
		codeService.update(codeDto);
		return "redirect:/v1/infra/code/codeXdmList";
	}
	
	@RequestMapping(value = "/v1/infra/code/codeXdmUele")
	public String codeXdmUele(CodeDto codeDto) {
		codeService.uelete(codeDto);
		return "redirect:/v1/infra/code/codeXdmList";
	}
	
	@RequestMapping(value = "/v1/infra/code/codeXdmDele")
	public String codeXdmDele(CodeDto codeDto) {
		codeService.delete(codeDto);
		return "redirect:/v1/infra/code/codeXdmList";
	}
	
}
