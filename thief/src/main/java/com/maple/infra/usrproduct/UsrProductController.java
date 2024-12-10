package com.maple.infra.usrproduct;





import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


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
		
		model.addAttribute("listimage", usrProductService.selectListImage());
		
		return "usr/v1/infra/usrui/usrShop";
	}
	
	@RequestMapping(value="/usrUi")
	public String usrUi(Model model) {
		
		model.addAttribute("list", usrProductService.selectList2());
		return "usr/v1/infra/usrui/usrUi";
	}
	
//	@RequestMapping(value="/usrModal")
//	public String usrModal(Model model, UsrProductDto UsrProductDto) {
//		model.addAttribute("item", usrProductService.selectOne(UsrProductDto));
//		return "usr/v1/infra/include/modal";
//	}
	
	@RequestMapping(value="/usrProduct")
	public String usrProduct(@ModelAttribute("vo") UsrProductVo vo, @ModelAttribute("dto") UsrProductDto usrProductDto, Model model) {
		
		vo.setParamsPaging(usrProductService.selectReviewCount(vo));
		model.addAttribute("item", usrProductService.selectOne(usrProductDto));
		
		model.addAttribute("system", usrProductService.selectListCodeGroup(usrProductDto));
		
		model.addAttribute("review", usrProductService.selectListReview(usrProductDto));
		
		model.addAttribute("player", usrProductService.selectListPlayer(usrProductDto));
		
		model.addAttribute("avg", usrProductService.reviewAvg(usrProductDto));
		
		
		
		return "usr/v1/infra/usrui/usrProduct";
	}
	
	@ResponseBody
	@RequestMapping(value="/usrProductInst")
	public Map<String, Object> usrProductInst(UsrProductDto usrProductDto) throws Exception {
		Map<String, Object> returnMap = new HashMap<String, Object>();
		
		UsrProductDto rtProduct = usrProductService.selectOneReview(usrProductDto);
		
		if (rtProduct != null) {
			usrProductService.insert(usrProductDto);
			System.out.println("1");
			returnMap.put("rt", "success");
			
		} else {
			usrProductService.insert(usrProductDto);
			System.out.println("2");
			returnMap.put("rt", "success");
		}
		return returnMap;
	}
	
	@RequestMapping(value="/usrProductUpdt")
	public String usrProductUpdt(UsrProductDto usrProductDto) {
		usrProductService.update(usrProductDto);
		return "redirect:/usrProduct";
	}
	
	@RequestMapping(value="/usrCheckOut")
	public String usrCheckOut(UsrProductDto usrProductDto, Model model) {
		
		model.addAttribute("item", usrProductService.selectOne(usrProductDto));
		
		return "usr/v1/infra/usrui/usrCheckOut";
	}
	
	@RequestMapping(value="/v1/infra/usrui/usrBuyList")
	public String usrBuyList(UsrProductDto usrProductDto, Model model) {
		
		model.addAttribute("list", usrProductService.selectListBuy(usrProductDto));
		
		return "usr/v1/infra/usrui/usrBuyList";
	}
	
	@RequestMapping(value="/usrpurchaseInst")
	public String usrpurchaseInst(UsrProductDto usrProductDto) {
		usrProductService.insertBuyList(usrProductDto);
		return "redirect:/v1/infra/usrui/usrBuyList";
	}
	
	
}
