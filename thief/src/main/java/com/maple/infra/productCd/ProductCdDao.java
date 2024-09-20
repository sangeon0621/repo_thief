package com.maple.infra.productCd;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface ProductCdDao {

	public List<ProductCdDto> selectList2(ProductCdVo vo);
	
	public int insert(ProductCdDto productCdDto);
	
	public ProductCdDto selectOne(ProductCdDto productCdDto);
	
	public int update(ProductCdDto productCdDto);
	
	public List<ProductCdDto> selectListCodeGroup();
	
	public int uelete(ProductCdDto productCdDto);
	
	public int delete(ProductCdDto productCdDto);
	
}
