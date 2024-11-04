package com.maple.infra.codegroup;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

public class CodeGroupDto {
	
	private String ifcgSeq;
	private String ifcgName;
	private Integer ifcgUseNy;
	private Integer ifcgOrder;
	private String ifcgDesc;
//	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date regDatetime;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date regDatetimeSvr;
	private Integer ifcgDelNy;
	private Integer count;
	
	private String cgiSeq;
	private Integer cgiDefaultly;
	private Integer cgiUseNy;
	private Integer cgiDelNy;
	private Integer cgiOrder;
	private String path;
	private String originalName;
	private String tableName;
	private Integer sort;
	private String ext;
	private String uuidName;
	private Long Size;
	private Integer type;
	private Integer maxNumber;
	private String regIp;
	private Date regDateTime;
	private Date regDateTimeSvr;
	private String pSeq;
	private MultipartFile uploadFile;
	private MultipartFile[] uploadFiles;
//	-----
	public String getIfcgSeq() {
		return ifcgSeq;
	}
	public void setIfcgSeq(String ifcgSeq) {
		this.ifcgSeq = ifcgSeq;
	}
	public String getIfcgName() {
		return ifcgName;
	}
	public void setIfcgName(String ifcgName) {
		this.ifcgName = ifcgName;
	}
	public Integer getIfcgUseNy() {
		return ifcgUseNy;
	}
	public void setIfcgUseNy(Integer ifcgUseNy) {
		this.ifcgUseNy = ifcgUseNy;
	}
	public Integer getIfcgOrder() {
		return ifcgOrder;
	}
	public void setIfcgOrder(Integer ifcgOrder) {
		this.ifcgOrder = ifcgOrder;
	}
	public String getIfcgDesc() {
		return ifcgDesc;
	}
	public void setIfcgDesc(String ifcgDesc) {
		this.ifcgDesc = ifcgDesc;
	}
	public Date getRegDatetime() {
		return regDatetime;
	}
	public void setRegDatetime(Date regDatetime) {
		this.regDatetime = regDatetime;
	}
	public Date getRegDatetimeSvr() {
		return regDatetimeSvr;
	}
	public void setRegDatetimeSvr(Date regDatetimeSvr) {
		this.regDatetimeSvr = regDatetimeSvr;
	}
	public Integer getIfcgDelNy() {
		return ifcgDelNy;
	}
	public void setIfcgDelNy(Integer ifcgDelNy) {
		this.ifcgDelNy = ifcgDelNy;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
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
	public void setOriginalName(String originName) {
		this.originalName = originName;
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
	public Long getSize() {
		return Size;
	}
	public void setSize(Long size) {
		Size = size;
	}
	public String getUuidName() {
		return uuidName;
	}
	public void setUuidName(String uuidName) {
		this.uuidName = uuidName;
	}
	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	public Integer getMaxNumber() {
		return maxNumber;
	}
	public void setMaxNumber(Integer maxNumber) {
		this.maxNumber = maxNumber;
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
	public String getpSeq() {
		return pSeq;
	}
	public void setpSeq(String pSeq) {
		this.pSeq = pSeq;
	}
	
	
	
}
