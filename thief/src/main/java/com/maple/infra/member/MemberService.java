package com.maple.infra.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MemberService {

	@Autowired
	MemberDao memberDao;
	
	public List<MemberDto> selectList3(MemberVo vo) {
		return memberDao.selectList3(vo);
	}
	public int insert2(MemberDto memberDto) {
		return memberDao.insert2(memberDto);
	}
	
	public MemberDto selectOne2(MemberDto memberDto) {
		return memberDao.selectOne2(memberDto);
	}
	
	public int update2(MemberDto memberDto) {
		return memberDao.update2(memberDto);
	}
	
	public int uelete2(MemberDto memberDto) {
		return memberDao.uelete2(memberDto);
	}
	
	public int delete2(MemberDto memberDto) {
		return memberDao.delete2(memberDto);
	}
	
}
