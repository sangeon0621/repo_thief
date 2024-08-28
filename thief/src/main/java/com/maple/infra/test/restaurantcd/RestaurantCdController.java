package com.maple.infra.test.restaurantcd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RestaurantCdController {

	@Autowired
	RestaurantService restaurantService;
	
	@RequestMapping(value = "/infra/restaurantCd/restaurantCd")
	public String restaurantCd() {
		List<RestaurantCdDto> restaurantCdDto = restaurantService.selectList7();
		for(RestaurantCdDto restaurantCdDto2 : restaurantCdDto) {
			System.out.println(restaurantCdDto2.getIfrcdType());
		}
		return "/v1/infra/restaurantCd/restaurantCd";
	}
	
}
