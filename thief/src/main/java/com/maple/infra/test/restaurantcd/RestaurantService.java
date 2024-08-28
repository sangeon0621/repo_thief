package com.maple.infra.test.restaurantcd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestaurantService {

	@Autowired
	RestaurantCdDao restaurantCdDao;
	
	public List<RestaurantCdDto> selectList7() {
		List<RestaurantCdDto> restaurantCdDto = restaurantCdDao.selectList7();
		return restaurantCdDto;
	}
	
}
