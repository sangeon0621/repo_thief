package com.maple.infra.test.classcg;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface ClassCGDao {

	public List<ClassCGDto> selectList4();
	
	public int insert4(ClassCGDto classCgDto);
	
}
