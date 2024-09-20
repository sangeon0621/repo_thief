package com.maple.infra.productCd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductCdService {

	@Autowired
	ProductCdDao productCdDao;
	
	public List<ProductCdDto> selectList2(ProductCdVo vo) {
		return productCdDao.selectList2(vo);
	}
	
	public int insert(ProductCdDto productCdDto) {
		return productCdDao.insert(productCdDto);
	}
	
	public ProductCdDto selectOne(ProductCdDto productCdDto) {
		return productCdDao.selectOne(productCdDto);
	}
	
	public int update(ProductCdDto productCdDto) {
		return productCdDao.update(productCdDto);
	}
	
	public List<ProductCdDto> selectListCodeGroup() {
		return productCdDao.selectListCodeGroup();
	}
	
	public int uelete(ProductCdDto productCdDto) {
		return productCdDao.uelete(productCdDto);
	}
	
	public int delete(ProductCdDto productCdDto) {
		return productCdDao.delete(productCdDto);
	}
	
}
