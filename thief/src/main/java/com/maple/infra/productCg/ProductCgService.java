package com.maple.infra.productCg;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductCgService {

	@Autowired
	ProductCgDao productCgDao;
	
	public List<ProductCgDto> selectList(ProductCgVo vo) {
		
		return productCgDao.selectList(vo);
	}
	
	
	public int insert(ProductCgDto productCgDto) {
		return productCgDao.insert(productCgDto);
	}
	
	public ProductCgDto selectOne(ProductCgDto productCgDto) {
		return productCgDao.selectOne(productCgDto);
	}
	
	public int update(ProductCgDto productCgDto) {
		return productCgDao.update(productCgDto);
	}
	
	public int uelete(ProductCgDto productCgDto) {
		return productCgDao.uelete(productCgDto);
	}
	
	public int delete(ProductCgDto productCgDto) {
		return productCgDao.delete(productCgDto);
	}
	
}
