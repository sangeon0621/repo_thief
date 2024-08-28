package com.maple.infra.test.restaurantcg;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantCgDao {
	
	List<RestaurantCgDto> selectList6();
	
}
