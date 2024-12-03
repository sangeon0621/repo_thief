package com.maple.infra.productCd;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.ObjectMetadata;

@Service
public class ProductCdService {

	@Autowired
	ProductCdDao productCdDao;
	@Autowired
	AmazonS3Client amazonS3Client;
	
	public int selectOneCount(ProductCdVo vo) { 
    	return productCdDao.selectOneCount(vo); 
    }
	
	public List<ProductCdDto> selectList2(ProductCdVo vo) {
		return productCdDao.selectList2(vo);
	}
	
	public int insert(ProductCdDto productCdDto) throws Exception {
		for(int i=0; i<productCdDto.getUploadFiles().length; i++) {
			
			if(!productCdDto.getUploadFiles()[i].isEmpty()) {
				
//				String className = dto.getClass().getSimpleName().toString().toLowerCase();		
				String fileName = productCdDto.getUploadFiles()[i].getOriginalFilename();
				String ext = fileName.substring(fileName.lastIndexOf(".") + 1);
				String uuid = UUID.randomUUID().toString();
				String uuidFileName = uuid + "." + ext;
//				String pathModule = className;
//				String nowString = UtilDateTime.nowString();
//				String pathDate = nowString.substring(0,4) + "/" + nowString.substring(5,7) + "/" + nowString.substring(8,10); 
//				String path = pathModule + "/" + type + "/" + pathDate + "/";
//				String pathForView = Constants.UPLOADED_PATH_PREFIX_FOR_VIEW_LOCAL + "/" + pathModule + "/" + type + "/" + pathDate + "/";
				
				
		        ObjectMetadata metadata = new ObjectMetadata();
		        metadata.setContentLength(productCdDto.getUploadFiles()[i].getSize());
		        metadata.setContentType(productCdDto.getUploadFiles()[i].getContentType());
		        
		        amazonS3Client.putObject("thief", uuidFileName, productCdDto.getUploadFiles()[i].getInputStream(), metadata);
				
		        String objectUrl = amazonS3Client.getUrl("thief", uuidFileName).toString();
		        System.out.println(objectUrl);
		        productCdDto.setPath(objectUrl);
		        productCdDto.setOriginalName(fileName);
		        productCdDto.setUuidName(uuidFileName);
		        productCdDto.setExt(ext);
		        productCdDto.setSize(productCdDto.getUploadFiles()[i].getSize());
				
//		        codeGroupDto.setTableName(tableName);
//		        codeGroupDto.setType(type);
//		        codeGroupDto.setCgiDefaultly();
//				codeGroupDto.setSort(maxNumber + i);
//				codeGroupDto.setpSeq(pSeq);
				
		        productCdDao.insertUpload(productCdDto);
			}
		}
		productCdDao.insert(productCdDto);
		return 1;
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
