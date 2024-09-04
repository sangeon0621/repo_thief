package com.maple.infra.test.restaurantcg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RestaurantCgController {

	@Autowired
	RestaurantCgService restaurantCgService;
	
	@RequestMapping(value = "/infra/restaurantCg/restaurantCgList")
	public String restaurantCg(Model model) {
		model.addAttribute("list4", restaurantCgService.selectList6());
		return "/v1/infra/restaurantCg/restaurantCg";
	}
	
	@RequestMapping(value = "/infra/restaurantCg/restaurantCgForm")
	public String restaurantCgForm() {
		return "/v1/infra/restaurantCg/restaurantCgForm";
	}
	
	@RequestMapping(value = "/infra/restaurantCg/restaurantCgInst")
	String restaurantCgInst(RestaurantCgDto restaurantCgDto) {
		restaurantCgService.insert4(restaurantCgDto);
		return "redirect:/infra/restaurantCg/restaurantCgList";
	}
	
	@RequestMapping(value = "/infra/restaurantCg/restaurantCgMForm")
	public String restaurantCgMForm(RestaurantCgDto restaurantCgDto, Model model) {
		model.addAttribute("item", restaurantCgService.selectOne(restaurantCgDto));
		return"/v1/infra/restaurantCg/restaurantCgMForm";
	}
	
	@RequestMapping(value = "/infra/restaurantCg/restaurantCgUpdt")
	String restaurantCgUpdt(RestaurantCgDto restaurantCgDto) {
		restaurantCgService.update(restaurantCgDto);
		return "redirect:/infra/restaurantCg/restaurantCgList";
	}
	
}
