package com.maple.infra.codegroup;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CodeGroupService {
	
	@Autowired
	CodeGroupDao codegroupdao;
	
	public List<CodeGroupDto> selectList() {
		List<CodeGroupDto> codeGroups = codegroupdao.selectList();
		return codeGroups;
	}
	
//	public List<CodeGroupDto> selectList() {
//		return codegroupdao.selectList();
//	}
	
	
}
