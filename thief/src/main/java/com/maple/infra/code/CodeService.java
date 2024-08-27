package com.maple.infra.code;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maple.infra.codegroup.CodeGroupDto;

@Service
public class CodeService {
	
	@Autowired
	CodeDao codeDao;
	
	public List<CodeDto> selectList2() {
		List<CodeDto> code = codeDao.selectList2();
		return code;
	}
	
	
	
}
