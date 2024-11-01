package com.maple.infra.codegroupimage;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface CodeGroupImageDao {

	public int insertUpload(CodeGroupImageDto dto);
	
	public List<CodeGroupImageDto> selectList();
	
}
