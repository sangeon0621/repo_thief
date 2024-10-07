package com.maple.infra.usrui;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface UsrDao {

public UsrDto selectoneId(UsrDto usrDto);
	
	public UsrDto selectOneLogin(UsrDto usrDto);
	
	public int selectOneCount(UsrVo vo);
	
	public List<UsrDto> selectList(UsrVo vo);

	public int insert(UsrDto usrDto);
	
	public UsrDto selectOne(UsrDto usrDto);
	
	public int update(UsrDto usrDto);
	
	public int uelete(UsrDto usrDto);
	
	public int delete(UsrDto usrDto);
	
}
