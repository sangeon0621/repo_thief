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
	
}
