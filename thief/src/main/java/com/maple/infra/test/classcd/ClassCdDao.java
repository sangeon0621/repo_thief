package com.maple.infra.test.classcd;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface ClassCdDao {

	List<ClassCdDto> selectList5();
	
}
