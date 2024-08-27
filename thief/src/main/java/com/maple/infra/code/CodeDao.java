package com.maple.infra.code;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface CodeDao {

	public List<CodeDto> selectList2();
	
}
