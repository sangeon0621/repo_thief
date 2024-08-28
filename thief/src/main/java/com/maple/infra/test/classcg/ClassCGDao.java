package com.maple.infra.test.classcg;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface ClassCGDao {

	List<ClassCGDto> selectList4();
	
}
