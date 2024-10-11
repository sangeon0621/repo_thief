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
			model.addAttribute("list", usrProductService.selectList2(vo));
		}
		
		model.addAttribute("list", usrProductService.selectList2(vo));
		
		return "/usr/v1/infra/usrui/usrShop";
	}
	
}
