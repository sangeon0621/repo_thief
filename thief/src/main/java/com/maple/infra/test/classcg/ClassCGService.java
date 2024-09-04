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
	
	public int insert4(ClassCGDto classCgDto) {
		return classCGDao.insert4(classCgDto);
	}
	
	public ClassCGDto selectOne(ClassCGDto classCgDto) {
		return classCGDao.selectOne(classCgDto);
	}
	
	public int update(ClassCGDto classCgDto) {
		return classCGDao.update(classCgDto);
	}
	
}
