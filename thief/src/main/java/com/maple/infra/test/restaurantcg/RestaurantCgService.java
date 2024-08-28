package com.maple.infra.test.restaurantcg;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestaurantCgService {
	
	@Autowired
	RestaurantCgDao restaurantCgDao;
	
	public List<RestaurantCgDto> selectList5() {
		List<RestaurantCgDto> restaurantCgDto = restaurantCgDao.selectList6();
		return restaurantCgDto;
	}
	
}
