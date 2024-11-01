//package com.maple.infra.codegroupimage;
//
//import java.io.IOException;
//import java.util.List;
//import java.util.UUID;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.web.multipart.MultipartFile;
//
//import com.amazonaws.AmazonServiceException;
//import com.amazonaws.SdkClientException;
//import com.amazonaws.services.s3.AmazonS3Client;
//import com.amazonaws.services.s3.model.ObjectMetadata;
//import com.maple.common.util.UtilDateTime;
//
//@Service
//public class CodeGroupImageService {
//
//	@Autowired
//	CodeGroupImageDao dao;
//	@Autowired
//	AmazonS3Client amazonS3Client;
//	
//	
//	public int insertUpload(CodeGroupImageDto dto) throws Exception {
//		
//		for(int i=0; i<multipartFiles.length; i++) {
//			
//			if(!multipartFiles[i].isEmpty()) {
//				
////				String className = dto.getClass().getSimpleName().toString().toLowerCase();		
//				String fileName = multipartFiles[i].getOriginalFilename();
//				String ext = fileName.substring(fileName.lastIndexOf(".") + 1);
//				String uuid = UUID.randomUUID().toString();
//				String uuidFileName = uuid + "." + ext;
////				String pathModule = className;
////				String nowString = UtilDateTime.nowString();
////				String pathDate = nowString.substring(0,4) + "/" + nowString.substring(5,7) + "/" + nowString.substring(8,10); 
////				String path = pathModule + "/" + type + "/" + pathDate + "/";
////				String pathForView = Constants.UPLOADED_PATH_PREFIX_FOR_VIEW_LOCAL + "/" + pathModule + "/" + type + "/" + pathDate + "/";
//				
//				
//		        ObjectMetadata metadata = new ObjectMetadata();
//		        metadata.setContentLength(multipartFiles[i].getSize());
//		        metadata.setContentType(multipartFiles[i].getContentType());
//		        
//		        amazonS3Client.putObject("duel", uuidFileName, multipartFiles[i].getInputStream(), metadata);
//				
//		        String objectUrl = amazonS3Client.getUrl("duel", uuidFileName).toString();
//		        System.out.println(objectUrl);
////				dto.setPath(objectUrl);
////				dto.setOriginalName(fileName);
////				dto.setUuidName(uuidFileName);
////				dto.setExt(ext);
////				dto.setSize(multipartFiles[i].getSize());
////				
////				dto.setTableName(tableName);
////				dto.setType(type);
////	//			dto.setDefaultNy();
////				dto.setSort(maxNumber + i);
////				dto.setCodeGroup_ifcgSeq(codeGroup_ifcgSeq);
//				
////				dao.insertUpload(dto);
//			}
//		}
//		
//		return dao.insertUpload(dto);
//	}
//	
//	public List<CodeGroupImageDto> selectList() {
//		return dao.selectList();
//	}
//	
//}
