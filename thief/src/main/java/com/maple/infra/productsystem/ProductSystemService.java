package com.maple.infra.productsystem;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductSystemService {

	@Autowired
	ProductSystemDao productSystemDao;
	
	public int selectOneCount(ProductSystemVo vo) { 
    	return productSystemDao.selectOneCount(vo); 
    }
	
	public List<ProductSystemDto> selectList2(ProductSystemVo vo) {
		return productSystemDao.selectList2(vo);
	}
	
	public int insert(ProductSystemDto productSystemDto) {
		return productSystemDao.insert(productSystemDto);
	}
	
	public ProductSystemDto selectOne(ProductSystemDto productSystemDto) {
		return productSystemDao.selectOne(productSystemDto);
	}
	
	public int update(ProductSystemDto productSystemDto) {
		return productSystemDao.update(productSystemDto);
	}
	
	public List<ProductSystemDto> selectListCodeGroup() {
		return productSystemDao.selectListCodeGroup();
	}
	
	public int uelete(ProductSystemDto productSystemDto) {
		return productSystemDao.uelete(productSystemDto);
	}
	
	public int delete(ProductSystemDto productSystemDto) {
		return productSystemDao.delete(productSystemDto);
	}
	
}
