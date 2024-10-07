package com.maple.infra.usrui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UsrService {

	@Autowired
	UsrDao usrDao;
	
	public int selectOneCount(UsrVo vo) { 
    	return usrDao.selectOneCount(vo); 
    }
	
	public List<UsrDto> selectList(UsrVo vo) {
		return usrDao.selectList(vo);
	}
	public int insert(UsrDto usrDto) {
		return usrDao.insert(usrDto);
	}
	
	public UsrDto selectOne(UsrDto usrDto) {
		return usrDao.selectOne(usrDto);
	}
	
	public UsrDto selectOneId(UsrDto usrDto) {
		return usrDao.selectOne(usrDto);
	}
	
	public UsrDto selectOneLogin(UsrDto usrDto) {
		return usrDao.selectOneLogin(usrDto);
	}
	
	public int update(UsrDto usrDto) {
		return usrDao.update(usrDto);
	}
	
	public int uelete(UsrDto usrDto) {
		return usrDao.uelete(usrDto);
	}
	
	public int delete(UsrDto usrDto) {
		return usrDao.delete(usrDto);
	}
	
}
