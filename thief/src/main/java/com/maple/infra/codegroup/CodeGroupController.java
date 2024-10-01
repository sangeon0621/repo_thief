package com.maple.infra.codegroup;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.maple.common.util.UtilDateTime;

import jakarta.servlet.http.HttpSession;


@Controller
public class CodeGroupController {
	
	@Autowired
	CodeGroupService codeGroupService;
	
	@RequestMapping(value = "/v1/infra/codegroup/codeGroupXdmList")
	public String codeGroupXdmList(@ModelAttribute("vo") CodeGroupVo vo, Model model, HttpSession httpSession) {
		vo.setShDateStart(vo.getShDateStart() == null || vo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(vo.getShDateStart()));
		vo.setShDateEnd(vo.getShDateEnd() == null || vo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(vo.getShDateEnd()));
//		vo.setShDateStart(vo.getShDateStart()+ " 00:00:00");
//		vo.setShDateEnd(vo.getShDateEnd()+ " 23:59:59");
		System.out.println("sessSeqXdm: " + httpSession.getAttribute("sessSeqXdm"));
		System.out.println("sessIdXdm: " + httpSession.getAttribute("sessIdXdm"));
		System.out.println("sessNameXdm: " + httpSession.getAttribute("sessNameXdm"));
		
		vo.setParamsPaging(codeGroupService.selectOneCount(vo));
		
		if (vo.getTotalRows() > 0) {
			model.addAttribute("list", codeGroupService.selectList(vo));
		}
		
		model.addAttribute("list", codeGroupService.selectList(vo));
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
		
		codeGroupService.insert(codeGroupDto);
		
		return "redirect:/v1/infra/codegroup/codeGroupXdmList";
	}
	
	@RequestMapping(value = "/v1/infra/codegroup/codeGroupXdmMForm")
	public String codeGroupXdmMForm(CodeGroupDto codeGroupDto, Model model) {
		model.addAttribute("item",codeGroupService.selectOne(codeGroupDto));
		return "/xdm/v1/infra/codegroup/codeGroupXdmMForm";
	}
	
	@RequestMapping(value = "/v1/infra/codegroup/codeGroupXdmUpdt")
	public String codeGroupXdmUpdt(CodeGroupDto codeGroupDto) {
		
		codeGroupService.update(codeGroupDto);
		
		return "redirect:/v1/infra/codegroup/codeGroupXdmList";
	}
	
	@RequestMapping(value = "/v1/infra/codegroup/codeGroupXdmUele")
	public String codeGroupXdmUele(CodeGroupDto codeGroupDto, Model model) {
		codeGroupService.uelete(codeGroupDto);
		return "redirect:/v1/infra/codegroup/codeGroupXdmList";
	}
	
	@RequestMapping(value = "/v1/infra/codegroup/codeGroupXdmDele")
	public String codeGroupXdmDele(CodeGroupDto codeGroupDto) {
		codeGroupService.delete(codeGroupDto);
		
		return "redirect:/v1/infra/codegroup/codeGroupXdmList";
	}
	
}
