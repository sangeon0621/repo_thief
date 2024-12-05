package com.maple.infra.usrproduct;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface UsrProductDao {

	public int selectOneCount(UsrProductVo vo);
	
	public int selectReviewCount(UsrProductVo vo);

	public List<UsrProductDto> selectList(UsrProductVo vo);
	
	public List<UsrProductDto> selectListImage();
	
	public int insert(UsrProductDto usrProductDto);
	
	public UsrProductDto selectOneReview(UsrProductDto usrProductDto);
	
	public UsrProductDto selectOne(UsrProductDto usrProductDto);
	
	public int update(UsrProductDto usrProductDto);
	
	public List<UsrProductDto> selectListCodeGroup(UsrProductDto usrProductDto);
	
	public List<UsrProductDto> selectListReview(UsrProductDto usrProductDto);
	
	public List<UsrProductDto> selectListPlayer(UsrProductDto usrProductDto);
	
	public int uelete(UsrProductDto usrProductDto);
	
	public int delete(UsrProductDto usrProductDto);
	
	public UsrProductDto reviewAvg(UsrProductDto usrProductDto);
	
	public int changePrice(UsrProductDto usrProductDto);
	
	public List<UsrProductDto> selectListBuy(UsrProductDto usrProductDto);
	
	public int insertBuyList(UsrProductDto usrProductDto);
	
	
	
}
