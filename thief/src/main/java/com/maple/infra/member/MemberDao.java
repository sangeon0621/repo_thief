package com.maple.infra.member;

import java.util.List;

import org.springframework.stereotype.Repository;


@Repository
public interface MemberDao {
	
	public List<MemberDto> selectList3(MemberVo vo);

	public int insert2(MemberDto memberDto);
	
	public MemberDto selectOne2(MemberDto memberDto);
	
	public int update2(MemberDto memberDto);
	
	public int uelete2(MemberDto memberDto);
	
	public int delete2(MemberDto memberDto);
	
	
}
