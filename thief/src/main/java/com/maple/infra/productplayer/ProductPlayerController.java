package com.maple.infra.productplayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ProductPlayerController {

	@Autowired
	ProductPlayerService productPlayerService;
	
	@RequestMapping(value = "/v1/infra/productplayer/productPlayerXdmList")
	public String productPlayerXdmList(@ModelAttribute("vo") ProductPlayerVo vo, Model model) {
		vo.setShDateStart(vo.getShDateStart() + "00:00:00");
		vo.setShDateEnd(vo.getShDateEnd() + "00:00:00");
		
		vo.setParamsPaging(productPlayerService.selectOneCount(vo));
		
		if (vo.getTotalRows() > 0) {
			model.addAttribute("list", productPlayerService.selectList2(vo));
		}
		
		model.addAttribute("list", productPlayerService.selectList2(vo));
		
		return "xdm/v1/infra/productplayer/productPlayerXdmList";
	}
	
	
	@RequestMapping(value = "/v1/infra/productplayer/productPlayerXdmForm")
	public String productPlayerXdmForm(Model model) {
		
		model.addAttribute("listProductCd", productPlayerService.selectListCodeGroup());
		
		return "xdm/v1/infra/productplayer/productPlayerXdmForm";
	}
	
	@RequestMapping(value = "v1/infra/productplayer/productPlayerXdmInst")
	public String productPlayerXdmInst(ProductPlayerDto productPlayerDto) {
		productPlayerService.insert(productPlayerDto);
		return "redirect:/v1/infra/productplayer/productPlayerXdmList";
	}
	
	@RequestMapping(value = "/v1/infra/productplayer/productPlayerMForm")
	public String productPlayerMForm(ProductPlayerDto productPlayerDto, Model model) {
		model.addAttribute("item", productPlayerService.selectOne(productPlayerDto));
		return "xdm/v1/infra/productplayer/productPlayerMForm";
	}
	
	@RequestMapping(value = "/v1/infra/productplayer/productPlayerXdmUpdt")
	public String productPlayerXdmUpdt(ProductPlayerDto productPlayerDto) {
		productPlayerService.update(productPlayerDto);
		return "redirect:/v1/infra/productplayer/productPlayerXdmList";
	}
	
	@RequestMapping(value = "/v1/infra/productplayer/productPlayerXdmUele")
	public String productPlayerXdmUele(ProductPlayerDto productPlayerDto) {
		productPlayerService.uelete(productPlayerDto);
		return "redirect:/v1/infra/productplayer/productPlayerXdmList";
	}
	
	@RequestMapping(value = "/v1/infra/productplayer/productPlayerXdmDele")
	public String productPlayerXdmDele(ProductPlayerDto productPlayerDto) {
		productPlayerService.delete(productPlayerDto);
		return "redirect:/v1/infra/productplayer/productPlayerXdmList";
	}
	
}
