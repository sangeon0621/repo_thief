package com.maple.infra.code;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CodeService {

	@Autowired
	CodeDao codeDao;
	
	public List<CodeDto> selectList2() {
		List<CodeDto> codes = codeDao.selectList2();
		return codes;
	}
	
	public int insert(CodeDto codeDto) {
		return codeDao.insert(codeDto);
	}
	
	public CodeDto selectOne(CodeDto codeDto) {
		return codeDao.selectOne(codeDto);
	}
	
	public int update(CodeDto codeDto) {
		return codeDao.update(codeDto);
	}
	
}
