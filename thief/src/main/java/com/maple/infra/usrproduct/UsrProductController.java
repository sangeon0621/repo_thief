package com.maple.infra.usrproduct;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class UsrProductController {

	@Autowired
	UsrProductService usrProductService;
	
	@RequestMapping(value = "/usrShop")
	public String productCdXdmList(@ModelAttribute("vo") UsrProductVo vo, Model model) {
		vo.setShDateStart(vo.getShDateStart() + "00:00:00");
		vo.setShDateEnd(vo.getShDateEnd() + "00:00:00");
		
		vo.setParamsPaging(usrProductService.selectOneCount(vo));
		
		if (vo.getTotalRows() > 0) {
			model.addAttribute("list", usrProductService.selectList(vo));
		}
		
		model.addAttribute("list", usrProductService.selectList(vo));
		
		return "/usr/v1/infra/usrui/usrShop";
	}
	
	@RequestMapping(value="/usrProduct")
	public String usrProduct(@ModelAttribute("vo") UsrProductVo vo, UsrProductDto usrProductDto, Model model) {
		
		vo.setParamsPaging(usrProductService.selectReviewCount(vo));
		model.addAttribute("item", usrProductService.selectOne(usrProductDto));
		
		model.addAttribute("system", usrProductService.selectListCodeGroup(usrProductDto));
		
		model.addAttribute("review", usrProductService.selectListReview(usrProductDto));
		
		model.addAttribute("player", usrProductService.selectListPlayer(usrProductDto));
		
		model.addAttribute("avg", usrProductService.reviewAvg(usrProductDto));
		
		
		
		return "/usr/v1/infra/usrui/usrProduct";
	}
	
	@RequestMapping(value="/usrProductInst")
	public String usrProductInst(UsrProductDto usrProductDto) {
		usrProductService.insert(usrProductDto);
		return "redirect:/usrProduct";
	}
	
	@RequestMapping(value="/usrProductUpdt")
	public String usrProductUpdt(UsrProductDto usrProductDto) {
		usrProductService.update(usrProductDto);
		return "redirect:/usrProduct";
	}
	
	@RequestMapping(value="/usrCheckOut")
	public String usrCheckOut(UsrProductDto usrProductDto, Model model) {
		
		model.addAttribute("item", usrProductService.selectOne(usrProductDto));
		
		return "/usr/v1/infra/usrui/usrCheckOut";
	}
	
	
	
	
}
