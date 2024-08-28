package com.maple.infra.test.restaurantcg;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RestaurantCgController {

	@Autowired
	RestaurantCgService restaurantCgService;
	
	@RequestMapping(value = "/infra/restaurantCg/restaurantCg")
	public String restaurantCg() {
		List<RestaurantCgDto> restaurantCgDto = restaurantCgService.selectList5();
		for(RestaurantCgDto restaurantCgDto2 : restaurantCgDto) {
			System.out.println(restaurantCgDto2.getIfrcgName());
		}
		return "/v1/infra/restaurantCg/restaurantCg";
	}
	
}
