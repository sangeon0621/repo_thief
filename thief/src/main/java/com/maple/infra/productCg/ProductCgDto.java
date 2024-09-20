package com.maple.infra.productCg;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class ProductCgDto {

	private String pdSeq;
	private String pdCategory;
	private Integer pdUseNy;
	private Integer pdOrder;
	private String pdDesc;
	private Date pdDatetime;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date pdDatetimeSvr;
	private Integer pdDelNy;
//	-----
	public String getPdSeq() {
		return pdSeq;
	}
	public void setPdSeq(String pdSeq) {
		this.pdSeq = pdSeq;
	}
	public String getPdCategory() {
		return pdCategory;
	}
	public void setPdCategory(String pdCategory) {
		this.pdCategory = pdCategory;
	}
	public Integer getPdUseNy() {
		return pdUseNy;
	}
	public void setPdUseNy(Integer pdUseNy) {
		this.pdUseNy = pdUseNy;
	}
	public Integer getPdOrder() {
		return pdOrder;
	}
	public void setPdOrder(Integer pdOrder) {
		this.pdOrder = pdOrder;
	}
	public String getPdDesc() {
		return pdDesc;
	}
	public void setPdDesc(String pdDesc) {
		this.pdDesc = pdDesc;
	}
	public Date getPdDatetime() {
		return pdDatetime;
	}
	public void setPdDatetime(Date pdDatetime) {
		this.pdDatetime = pdDatetime;
	}
	public Date getPdDatetimeSvr() {
		return pdDatetimeSvr;
	}
	public void setPdDatetimeSvr(Date pdDatetimeSvr) {
		this.pdDatetimeSvr = pdDatetimeSvr;
	}
	public Integer getPdDelNy() {
		return pdDelNy;
	}
	public void setPdDelNy(Integer pdDelNy) {
		this.pdDelNy = pdDelNy;
	}
	
	
}
