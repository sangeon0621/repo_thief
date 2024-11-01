//package com.maple.infra.codegroupimage;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//@Controller
//public class CodeGroupImageController {
//
//	@Autowired
//	CodeGroupImageService service;
//	
//	@RequestMapping(value="/v1/infra/codegroupimage/codeGroupImageXdmList")
//	public String codeGroupImageXdmList(Model model) {
//		
//		model.addAttribute("list", service.selectList());
//		
//		return "/xdm/v1/infra/codegroupimage/codeGroupImageXdmList";
//	}
//	
//	@RequestMapping(value="/v1/infra/codegroupimage/codeGroupImageXdmForm")
//	public String codeGroupImageXdmForm() {
//		return "/xdm/v1/infra/codegroupimage/codeGroupImageXdmForm";
//	}
//	
//	@RequestMapping(value="/v1/infra/codegroupimage/codeGroupImageXdmInst")
//	public String codeGroupImageXdmInst(CodeGroupImageDto dto) throws Exception {
//		
//		service.insertUpload(dto);
//		
//		return "redirect:/v1/infra/codegroupimage/codeGroupImageXdmList";
//	}
//	
//}
