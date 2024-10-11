package com.maple.infra.usrproduct;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface UsrProductDao {

	public int selectOneCount(UsrProductVo vo);

	public List<UsrProductDto> selectList2(UsrProductVo vo);
	
	public int insert(UsrProductDto usrProductDto);
	
	public UsrProductDto selectOne(UsrProductDto usrProductDto);
	
	public int update(UsrProductDto usrProductDto);
	
	public List<UsrProductDto> selectListCodeGroup();
	
	public int uelete(UsrProductDto usrProductDto);
	
	public int delete(UsrProductDto usrProductDto);
	
}
