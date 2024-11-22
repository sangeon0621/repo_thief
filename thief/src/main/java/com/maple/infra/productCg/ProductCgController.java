package com.maple.infra.productCg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductCgController {

	
	@Autowired
	ProductCgService productCgService;
	
	@RequestMapping(value = "/v1/infra/productCg/productCgXdmList")
	public String productCgXdmList(@ModelAttribute("vo") ProductCgVo vo, Model model) {
		vo.setShDateStart(vo.getShDateStart()+ " 00:00:00");
		vo.setShDateEnd(vo.getShDateEnd()+ " 23:59:59");
		
		vo.setParamsPaging(productCgService.selectOneCount(vo));
		
		if (vo.getTotalRows() > 0) {
			model.addAttribute("list", productCgService.selectList(vo));
		}
		
		model.addAttribute("list", productCgService.selectList(vo));
		return "xdm/v1/infra/productCg/productCgXdmList";
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
	
	@RequestMapping(value = "/v1/infra/productCg/productCgXdmForm")
	public String productCgXdmForm() {
		
		return "xdm/v1/infra/productCg/productCgXdmForm";
	}
	
	@RequestMapping(value = "/v1/infra/productCg/productCgXdmInst")
	public String codeGroupXdmInst(ProductCgDto productCgDto) {
		
		productCgService.insert(productCgDto);
		
		return "redirect:/v1/infra/productCg/productCgXdmList";
	}
	
	@RequestMapping(value = "/v1/infra/productCg/productCgXdmMForm")
	public String codeGroupXdmMForm(ProductCgDto productCgDto, Model model) {
		model.addAttribute("item",productCgService.selectOne(productCgDto));
		return "xdm/v1/infra/productCg/productCgXdmMForm";
	}
	
	@RequestMapping(value = "/v1/infra/productCg/productCgXdmUpdt")
	public String codeGroupXdmUpdt(ProductCgDto productCgDto) {
		
		productCgService.update(productCgDto);
		
		return "redirect:/v1/infra/productCg/productCgXdmList";
	}
	
	@RequestMapping(value = "/v1/infra/productCg/productCgXdmUele")
	public String codeGroupXdmUele(ProductCgDto productCgDto, Model model) {
		productCgService.uelete(productCgDto);
		return "redirect:/v1/infra/productCg/productCgXdmList";
	}
	
	@RequestMapping(value = "/v1/infra/productCg/productCgXdmDele")
	public String codeGroupXdmDele(ProductCgDto productCgDto) {
		productCgService.delete(productCgDto);
		
		return "redirect:/v1/infra/productCg/productCgXdmList";
	}
	
}
