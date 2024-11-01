package com.maple.infra.codegroupimage;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

public class CodeGroupImageDto {

	private String cgiSeq;
	private Integer cgiDefaultly;
	private Integer cgiUseNy;
	private Integer cgiDelNy;
	private Integer cgiOrder;
	private String path;
	private String originalName;
	private String tableName;
	private String ext;
	private Integer type;
	private String uuidName;
	private String regIp;
	private Date regDateTime;
	private Date regDateTimeSvr;
	private String codeGroup_ifcgSeq;
	private Long size;
	private MultipartFile uploadFile;
	private MultipartFile[] uploadFiles;
	public String getCgiSeq() {
		return cgiSeq;
	}
	public void setCgiSeq(String cgiSeq) {
		this.cgiSeq = cgiSeq;
	}
	public Integer getCgiDefaultly() {
		return cgiDefaultly;
	}
	public void setCgiDefaultly(Integer cgiDefaultly) {
		this.cgiDefaultly = cgiDefaultly;
	}
	public Integer getCgiUseNy() {
		return cgiUseNy;
	}
	public void setCgiUseNy(Integer cgiUseNy) {
		this.cgiUseNy = cgiUseNy;
	}
	public Integer getCgiDelNy() {
		return cgiDelNy;
	}
	public void setCgiDelNy(Integer cgiDelNy) {
		this.cgiDelNy = cgiDelNy;
	}
	public Integer getCgiOrder() {
		return cgiOrder;
	}
	public void setCgiOrder(Integer cgiOrder) {
		this.cgiOrder = cgiOrder;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getOriginalName() {
		return originalName;
	}
	public void setOriginalName(String originalName) {
		this.originalName = originalName;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public String getExt() {
		return ext;
	}
	public void setExt(String ext) {
		this.ext = ext;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getUuidName() {
		return uuidName;
	}
	public void setUuidName(String uuidName) {
		this.uuidName = uuidName;
	}
	public String getRegIp() {
		return regIp;
	}
	public void setRegIp(String regIp) {
		this.regIp = regIp;
	}
	public Date getRegDateTime() {
		return regDateTime;
	}
	public void setRegDateTime(Date regDateTime) {
		this.regDateTime = regDateTime;
	}
	public Date getRegDateTimeSvr() {
		return regDateTimeSvr;
	}
	public void setRegDateTimeSvr(Date regDateTimeSvr) {
		this.regDateTimeSvr = regDateTimeSvr;
	}
	public String getCodeGroup_ifcgSeq() {
		return codeGroup_ifcgSeq;
	}
	public void setCodeGroup_ifcgSeq(String codeGroup_ifcgSeq) {
		this.codeGroup_ifcgSeq = codeGroup_ifcgSeq;
	}
	public MultipartFile getUploadFile() {
		return uploadFile;
	}
	public void setUploadFile(MultipartFile uploadFile) {
		this.uploadFile = uploadFile;
	}
	public MultipartFile[] getUploadFiles() {
		return uploadFiles;
	}
	public void setUploadFiles(MultipartFile[] uploadFiles) {
		this.uploadFiles = uploadFiles;
	}
	public Long getSize() {
		return size;
	}
	public void setSize(Long size) {
		this.size = size;
	}
	
//	-----
	
	
	
}
