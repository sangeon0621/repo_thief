package com.maple.infra.test.member;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface MemberTableDao {

	public List<MemberTableDto> selectList3();
	
}
