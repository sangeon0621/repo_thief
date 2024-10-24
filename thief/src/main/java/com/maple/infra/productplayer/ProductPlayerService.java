package com.maple.infra.productplayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductPlayerService {

	@Autowired
	ProductPlayerDao productPlayerDao;
	
	public int selectOneCount(ProductPlayerVo vo) { 
    	return productPlayerDao.selectOneCount(vo); 
    }
	
	public List<ProductPlayerDto> selectList2(ProductPlayerVo vo) {
		return productPlayerDao.selectList2(vo);
	}
	
	public int insert(ProductPlayerDto productPlayerDto) {
		return productPlayerDao.insert(productPlayerDto);
	}
	
	public ProductPlayerDto selectOne(ProductPlayerDto productPlayerDto) {
		return productPlayerDao.selectOne(productPlayerDto);
	}
	
	public int update(ProductPlayerDto productPlayerDto) {
		return productPlayerDao.update(productPlayerDto);
	}
	
	public List<ProductPlayerDto> selectListCodeGroup() {
		return productPlayerDao.selectListCodeGroup();
	}
	
	public int uelete(ProductPlayerDto productPlayerDto) {
		return productPlayerDao.uelete(productPlayerDto);
	}
	
	public int delete(ProductPlayerDto productPlayerDto) {
		return productPlayerDao.delete(productPlayerDto);
	}
	
}
