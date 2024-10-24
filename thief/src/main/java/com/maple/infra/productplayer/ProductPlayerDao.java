package com.maple.infra.productplayer;

import java.util.List;

import org.springframework.stereotype.Repository;


@Repository
public interface ProductPlayerDao {

	public int selectOneCount(ProductPlayerVo vo);

	public List<ProductPlayerDto> selectList2(ProductPlayerVo vo);
	
	public int insert(ProductPlayerDto productPlayerDto);
	
	public ProductPlayerDto selectOne(ProductPlayerDto productPlayerDto);
	
	public int update(ProductPlayerDto productPlayerDto);
	
	public List<ProductPlayerDto> selectListCodeGroup();
	
	public int uelete(ProductPlayerDto productPlayerDto);
	
	public int delete(ProductPlayerDto productPlayerDto);
	
}
