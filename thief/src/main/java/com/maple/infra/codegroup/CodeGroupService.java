package com.maple.infra.codegroup;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CodeGroupService {
	
	@Autowired
	CodeGroupDao codegroupdao;
	
    public int selectOneCount(CodeGroupVo vo) { 
    	return codegroupdao.selectOneCount(vo); 
    }
	
	public List<CodeGroupDto> selectList(CodeGroupVo vo) {
		
		return codegroupdao.selectList(vo);
	}
	
//	public List<CodeGroupDto> selectList() {
//		return codegroupdao.selectList();
//	}
	
//	public int insert(CodeGroupDto codeGroupDto) {
//		int result = codegroupdao.insert(codeGroupDto)
//		return result;
//	}
	
	public int insert(CodeGroupDto codeGroupDto) {
		return codegroupdao.insert(codeGroupDto);
	}
	
	public CodeGroupDto selectOne(CodeGroupDto codeGroupDto) {
		return codegroupdao.selectOne(codeGroupDto);
	}
	
	public int update(CodeGroupDto codeGroupDto) {
		return codegroupdao.update(codeGroupDto);
	}
	
	public int uelete(CodeGroupDto codeGroupDto) {
		return codegroupdao.uelete(codeGroupDto);
	}
	
	public int delete(CodeGroupDto codeGroupDto) {
		return codegroupdao.delete(codeGroupDto);
	}
	
	
}
