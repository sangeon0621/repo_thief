package com.maple.infra.productCd;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.maple.infra.member.MemberVo;

@Repository
public interface ProductCdDao {
	
	public int selectOneCount(ProductCdVo vo);

	public List<ProductCdDto> selectList2(ProductCdVo vo);
	
	public int insert(ProductCdDto productCdDto);
	
	public int insertUpload(ProductCdDto productCdDto);
	
	public ProductCdDto selectOne(ProductCdDto productCdDto);
	
	public int update(ProductCdDto productCdDto);
	
	public List<ProductCdDto> selectListCodeGroup();
	
	public int uelete(ProductCdDto productCdDto);
	
	public int delete(ProductCdDto productCdDto);
	
}
