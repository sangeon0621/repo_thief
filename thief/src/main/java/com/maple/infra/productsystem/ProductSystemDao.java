package com.maple.infra.productsystem;

import java.util.List;

import org.springframework.stereotype.Repository;


@Repository
public interface ProductSystemDao {

	public int selectOneCount(ProductSystemVo vo);

	public List<ProductSystemDto> selectList2(ProductSystemVo vo);
	
	public int insert(ProductSystemDto productSystemDto);
	
	public ProductSystemDto selectOne(ProductSystemDto productSystemDto);
	
	public int update(ProductSystemDto productSystemDto);
	
	public List<ProductSystemDto> selectListCodeGroup();
	
	public int uelete(ProductSystemDto productSystemDto);
	
	public int delete(ProductSystemDto productSystemDto);
	
}
