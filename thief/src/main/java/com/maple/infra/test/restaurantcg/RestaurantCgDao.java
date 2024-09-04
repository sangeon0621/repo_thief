package com.maple.infra.test.restaurantcg;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantCgDao {
	
	public List<RestaurantCgDto> selectList6();
	
	public int insert4(RestaurantCgDto restaurantCgDto);
	
	public RestaurantCgDto selectOne(RestaurantCgDto restaurantCgDto); 
	
	public int update(RestaurantCgDto restaurantCgDto);
	
}
