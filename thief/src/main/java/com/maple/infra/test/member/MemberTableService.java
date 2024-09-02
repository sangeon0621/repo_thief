package com.maple.infra.test.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberTableService {

	@Autowired
	MemberTableDao memberTableDao;
	
	public List<MemberTableDto> selectList3() {
		List<MemberTableDto> members = memberTableDao.selectList3();
		return members;
	}
	
	public int insert3(MemberTableDto memberTableDto) {
		return memberTableDao.insert3(memberTableDto);
	}
	
}
