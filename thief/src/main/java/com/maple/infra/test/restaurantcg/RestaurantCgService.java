package com.maple.infra.test.restaurantcg;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestaurantCgService {
	
	@Autowired
	RestaurantCgDao restaurantCgDao;
	
	public List<RestaurantCgDto> selectList6() {
		List<RestaurantCgDto> restaurantCgDto = restaurantCgDao.selectList6();
		return restaurantCgDto;
	}
	
	public int insert4(RestaurantCgDto restaurantCgDto) {
		return restaurantCgDao.insert4(restaurantCgDto);
	}
	
}
