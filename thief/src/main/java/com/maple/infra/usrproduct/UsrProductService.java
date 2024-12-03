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
	
	public int selectReviewCount(UsrProductVo vo) { 
    	return usrProductDao.selectReviewCount(vo); 
    }
	
	public List<UsrProductDto> selectList(UsrProductVo vo) {
		return usrProductDao.selectList(vo);
	}
	
	public List<UsrProductDto> selectListImage() {
		return usrProductDao.selectListImage();
	}
	
	public int insert(UsrProductDto usrProductDto) {
		return usrProductDao.insert(usrProductDto);
	}
	
	public UsrProductDto selectOne(UsrProductDto usrProductDto) {
		return usrProductDao.selectOne(usrProductDto);
	}
	
	
	public int update(UsrProductDto usrProductDto) {
		return usrProductDao.update(usrProductDto);
	}
	
	public List<UsrProductDto> selectListCodeGroup(UsrProductDto usrProductDto) {
		return usrProductDao.selectListCodeGroup(usrProductDto);
	}
	
	public List<UsrProductDto> selectListReview(UsrProductDto usrProductDto) {
		return usrProductDao.selectListReview(usrProductDto);
	}
	
	public List<UsrProductDto> selectListPlayer(UsrProductDto usrProductDto) {
		return usrProductDao.selectListPlayer(usrProductDto);
	}
	
	public int uelete(UsrProductDto usrProductDto) {
		return usrProductDao.uelete(usrProductDto);
	}
	
	public int delete(UsrProductDto usrProductDto) {
		return usrProductDao.delete(usrProductDto);
	}
	
	public UsrProductDto reviewAvg(UsrProductDto usrProductDto) {
		
		return usrProductDao.reviewAvg(usrProductDto);
	}
	
	public int changePrice(UsrProductDto usrProductDto) {
		return usrProductDao.changePrice(usrProductDto);
	}
	
	public List<UsrProductDto> selectListBuy(UsrProductDto usrProductDto) {
		return usrProductDao.selectListBuy(usrProductDto);
	}
	
	public int insertBuyList(UsrProductDto usrProductDto) {
		
		return usrProductDao.insertBuyList(usrProductDto);
	}
	
	
}
