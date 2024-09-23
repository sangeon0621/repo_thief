package com.maple.infra.productCd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ProductCdController {

	@Autowired
	ProductCdService productCdService;
	
	@RequestMapping(value = "/v1/infra/productCd/productCdXdmList")
	public String productCdXdmList(@ModelAttribute("vo") ProductCdVo vo, Model model) {
		vo.setShDateStart(vo.getShDateStart() + "00:00:00");
		vo.setShDateEnd(vo.getShDateEnd() + "00:00:00");
		
		vo.setParamsPaging(productCdService.selectOneCount(vo));
		
		if (vo.getTotalRows() > 0) {
			model.addAttribute("list", productCdService.selectList2(vo));
		}
		
		model.addAttribute("list", productCdService.selectList2(vo));
		
		return "/xdm/v1/infra/productCd/productCdXdmList";
	}
	
	
	@RequestMapping(value = "/v1/infra/productCd/productCdXdmForm")
	public String codeXdmForm(Model model) {
		
		model.addAttribute("listProductCg", productCdService.selectListCodeGroup());
		
		return "/xdm/v1/infra/productCd/productCdXdmForm";
	}
	
	@RequestMapping(value = "v1/infra/productCd/productCdXdmInst")
	public String codeXdmInst(ProductCdDto productCdDto) {
		productCdService.insert(productCdDto);
		return "redirect:/v1/infra/productCd/productCdXdmList";
	}
	
	@RequestMapping(value = "/v1/infra/productCd/productCdXdmMForm")
	public String codeXdmMForm(ProductCdDto productCdDto, Model model) {
		model.addAttribute("item", productCdService.selectOne(productCdDto));
		return "/xdm/v1/infra/productCd/productCdXdmMForm";
	}
	
	@RequestMapping(value = "/v1/infra/productCd/productCdXdmUpdt")
	public String codeXdmUpdt(ProductCdDto productCdDto) {
		productCdService.update(productCdDto);
		return "redirect:/v1/infra/productCd/productCdXdmList";
	}
	
	@RequestMapping(value = "/v1/infra/productCd/productCdXdmUele")
	public String codeXdmUele(ProductCdDto productCdDto) {
		productCdService.uelete(productCdDto);
		return "redirect:/v1/infra/productCd/productCdXdmList";
	}
	
	@RequestMapping(value = "/v1/infra/productCd/productCdXdmDele")
	public String codeXdmDele(ProductCdDto productCdDto) {
		productCdService.delete(productCdDto);
		return "redirect:/v1/infra/productCd/productCdXdmList";
	}
	
}
