package com.maple.infra.member;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.maple.infra.code.CodeVo;


@Repository
public interface MemberDao {
	
	public MemberDto selectoneId(MemberDto memberDto);
	
	public MemberDto selectOneLogin(MemberDto memberDto);
	
	public int selectOneCount(MemberVo vo);
	
	public List<MemberDto> selectList3(MemberVo vo);

	public int insert2(MemberDto memberDto);
	
	public MemberDto selectOne2(MemberDto memberDto);
	
	public int update2(MemberDto memberDto);
	
	public int uelete2(MemberDto memberDto);
	
	public int delete2(MemberDto memberDto);
	
	
}
