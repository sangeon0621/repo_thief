package com.maple.infra.codegroup;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.ObjectMetadata;

@Service
public class CodeGroupService {
	
	@Autowired
	CodeGroupDao codegroupdao;
	@Autowired
	AmazonS3Client amazonS3Client;
	
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
	
	public int insert(CodeGroupDto codeGroupDto) throws Exception {
		
		for(int i=0; i<codeGroupDto.getUploadFiles().length; i++) {
			
			if(!codeGroupDto.getUploadFiles()[i].isEmpty()) {
				
//				String className = dto.getClass().getSimpleName().toString().toLowerCase();		
				String fileName = codeGroupDto.getUploadFiles()[i].getOriginalFilename();
				String ext = fileName.substring(fileName.lastIndexOf(".") + 1);
				String uuid = UUID.randomUUID().toString();
				String uuidFileName = uuid + "." + ext;
//				String pathModule = className;
//				String nowString = UtilDateTime.nowString();
//				String pathDate = nowString.substring(0,4) + "/" + nowString.substring(5,7) + "/" + nowString.substring(8,10); 
//				String path = pathModule + "/" + type + "/" + pathDate + "/";
//				String pathForView = Constants.UPLOADED_PATH_PREFIX_FOR_VIEW_LOCAL + "/" + pathModule + "/" + type + "/" + pathDate + "/";
				
				
		        ObjectMetadata metadata = new ObjectMetadata();
		        metadata.setContentLength(codeGroupDto.getUploadFiles()[i].getSize());
		        metadata.setContentType(codeGroupDto.getUploadFiles()[i].getContentType());
		        
		        amazonS3Client.putObject("thief", uuidFileName, codeGroupDto.getUploadFiles()[i].getInputStream(), metadata);
				
		        String objectUrl = amazonS3Client.getUrl("thief", uuidFileName).toString();
		        System.out.println(objectUrl);
		        codeGroupDto.setPath(objectUrl);
		        codeGroupDto.setOriginalName(fileName);
		        codeGroupDto.setUuidName(uuidFileName);
		        codeGroupDto.setExt(ext);
		        codeGroupDto.setSize(codeGroupDto.getUploadFiles()[i].getSize());
				
//		        codeGroupDto.setTableName(tableName);
//		        codeGroupDto.setType(type);
//		        codeGroupDto.setCgiDefaultly();
//				codeGroupDto.setSort(maxNumber + i);
//				codeGroupDto.setCodeGroup_ifcgSeq(codeGroup_ifcgSeq);
				
				codegroupdao.insertUpload(codeGroupDto);
			}
		}
		codegroupdao.insert(codeGroupDto);
		return 1;
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
