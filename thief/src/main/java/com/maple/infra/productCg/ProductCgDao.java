package com.maple.infra.productCg;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface ProductCgDao {

	public List<ProductCgDto> selectList(ProductCgVo vo);
	
	public int insert(ProductCgDto productCgDto);
	
	public ProductCgDto selectOne(ProductCgDto productCgDto);
	
	public int update(ProductCgDto productCgDto);
	
	public int uelete(ProductCgDto productCgDto);
	
	public int delete(ProductCgDto productCgDto);
	
}
