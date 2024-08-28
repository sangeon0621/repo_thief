package com.maple.infra.test.classcg;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassCGService {

	@Autowired
	ClassCGDao classCGDao;
	
	public List<ClassCGDto> selectList4() {
		List<ClassCGDto> classCGDto = classCGDao.selectList4();
		return classCGDto;
	}
	
}
