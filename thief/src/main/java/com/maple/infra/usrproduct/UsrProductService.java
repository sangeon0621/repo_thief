package com.maple.infra.usrproduct;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsrProductService {

	@Autowired
	UsrProductDao usrProductDao;
	
	public int selectOneCount(UsrProductVo vo) { 
    	return usrProductDao.selectOneCount(vo); 
    }
	
	public List<UsrProductDto> selectList(UsrProductVo vo) {
		return usrProductDao.selectList(vo);
	}
	
	public int insert(UsrProductDto usrProductDto) {
		return usrProductDao.insert(usrProductDto);
	}
	
	public UsrProductDto selectOne(UsrProductDto usrProductDto) {
		return usrProductDao.selectOne(usrProductDto);
	}
	
	public UsrProductDto selectOne2(UsrProductDto usrProductDto) {
		return usrProductDao.selectOne2(usrProductDto);
	}
	
	public int update(UsrProductDto usrProductDto) {
		return usrProductDao.update(usrProductDto);
	}
	
	public List<UsrProductDto> selectListCodeGroup() {
		return usrProductDao.selectListCodeGroup();
	}
	
	public int uelete(UsrProductDto usrProductDto) {
		return usrProductDao.uelete(usrProductDto);
	}
	
	public int delete(UsrProductDto usrProductDto) {
		return usrProductDao.delete(usrProductDto);
	}
	
}
