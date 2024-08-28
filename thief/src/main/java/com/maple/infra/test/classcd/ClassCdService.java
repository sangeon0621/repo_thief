package com.maple.infra.test.classcd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassCdService {

	@Autowired
	ClassCdDao classCdDao;
	
	public List<ClassCdDto> selectList5() {
		List<ClassCdDto> classCdDto = classCdDao.selectList5();
		return classCdDto;
	}
	
}
