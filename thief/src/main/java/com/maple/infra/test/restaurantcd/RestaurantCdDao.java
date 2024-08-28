package com.maple.infra.test.restaurantcd;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantCdDao {

	List<RestaurantCdDto> selectList7();
	
}
