package com.maple.infra.productsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.maple.infra.productCd.ProductCdDto;
import com.maple.infra.productCd.ProductCdVo;

@Controller
public class ProductSystemController {

	@Autowired
	ProductSystemService productSystemService;
	
	@RequestMapping(value = "/v1/infra/productsystem/productSystemXdmList")
	public String productCdXdmList(@ModelAttribute("vo") ProductSystemVo vo, Model model) {
		vo.setShDateStart(vo.getShDateStart() + "00:00:00");
		vo.setShDateEnd(vo.getShDateEnd() + "00:00:00");
		
		vo.setParamsPaging(productSystemService.selectOneCount(vo));
		
		if (vo.getTotalRows() > 0) {
			model.addAttribute("list", productSystemService.selectList2(vo));
		}
		
		model.addAttribute("list", productSystemService.selectList2(vo));
		
		return "/xdm/v1/infra/productsystem/productSystemXdmList";
	}
	
	
	@RequestMapping(value = "/v1/infra/productsystem/productSystemXdmForm")
	public String productSystemXdmForm(Model model) {
		
		model.addAttribute("listProductCd", productSystemService.selectListCodeGroup());
		
		return "/xdm/v1/infra/productsystem/productSystemXdmForm";
	}
	
	@RequestMapping(value = "v1/infra/productsystem/productSystemXdmInst")
	public String productSystemXdmInst(ProductSystemDto productSystemDto) {
		productSystemService.insert(productSystemDto);
		return "redirect:/v1/infra/productsystem/productSystemXdmList";
	}
	
	@RequestMapping(value = "/v1/infra/productsystem/productSystemMForm")
	public String productSystemMForm(ProductSystemDto productSystemDto, Model model) {
		model.addAttribute("item", productSystemService.selectOne(productSystemDto));
		return "/xdm/v1/infra/productsystem/productSystemXdmMForm";
	}
	
	@RequestMapping(value = "/v1/infra/productsystem/productSystemXdmUpdt")
	public String productSystemXdmUpdt(ProductSystemDto productSystemDto) {
		productSystemService.update(productSystemDto);
		return "redirect:/v1/infra/productsystem/productSystemXdmList";
	}
	
	@RequestMapping(value = "/v1/infra/productsystem/productSystemXdmUele")
	public String productSystemXdmUele(ProductSystemDto productSystemDto) {
		productSystemService.uelete(productSystemDto);
		return "redirect:/v1/infra/productsystem/productSystemXdmList";
	}
	
	@RequestMapping(value = "/v1/infra/productsystem/productSystemXdmDele")
	public String productSystemXdmDele(ProductSystemDto productSystemDto) {
		productSystemService.delete(productSystemDto);
		return "redirect:/v1/infra/productsystem/productSystemXdmList";
	}
	
}
