package com.maple.infra.productCd;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class ProductCdDto {

	private String pddSeq;
	private String pddName;
	private String pddCategory;
	private Integer pddUseNy;
	private Integer pddDelNy;
	private Integer pddOrder;
	private String pddPrice;
	private Integer pddCount;
	private String pddTotalPrice;
	private Date pddDatetime;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date pddDatetimeSvr;
	private String pddDesc;
	private String productCg_pdSeq;
	private String pdCategory;
//	-----
	public String getPddSeq() {
		return pddSeq;
	}
	public void setPddSeq(String pddSeq) {
		this.pddSeq = pddSeq;
	}
	public String getPddName() {
		return pddName;
	}
	public void setPddName(String pddName) {
		this.pddName = pddName;
	}
	public String getPddCategory() {
		return pddCategory;
	}
	public void setPddCategory(String pddCategory) {
		this.pddCategory = pddCategory;
	}
	public Integer getPddUseNy() {
		return pddUseNy;
	}
	public void setPddUseNy(Integer pddUseNy) {
		this.pddUseNy = pddUseNy;
	}
	public Integer getPddDelNy() {
		return pddDelNy;
	}
	public void setPddDelNy(Integer pddDelNy) {
		this.pddDelNy = pddDelNy;
	}
	public Integer getPddOrder() {
		return pddOrder;
	}
	public void setPddOrder(Integer pddOrder) {
		this.pddOrder = pddOrder;
	}
	public String getPddPrice() {
		return pddPrice;
	}
	public void setPddPrice(String pddPrice) {
		this.pddPrice = pddPrice;
	}
	public Integer getPddCount() {
		return pddCount;
	}
	public void setPddCount(Integer pddCount) {
		this.pddCount = pddCount;
	}
	public String getPddTotalPrice() {
		return pddTotalPrice;
	}
	public void setPddTotalPrice(String pddTotalPrice) {
		this.pddTotalPrice = pddTotalPrice;
	}
	public Date getPddDatetime() {
		return pddDatetime;
	}
	public void setPddDatetime(Date pddDatetime) {
		this.pddDatetime = pddDatetime;
	}
	public Date getPddDatetimeSvr() {
		return pddDatetimeSvr;
	}
	public void setPddDatetimeSvr(Date pddDatetimeSvr) {
		this.pddDatetimeSvr = pddDatetimeSvr;
	}
	public String getPddDesc() {
		return pddDesc;
	}
	public void setPddDesc(String pddDesc) {
		this.pddDesc = pddDesc;
	}
	public String getProductCg_pdSeq() {
		return productCg_pdSeq;
	}
	public void setProductCg_pdSeq(String productCg_pdSeq) {
		this.productCg_pdSeq = productCg_pdSeq;
	}
	public String getPdCategory() {
		return pdCategory;
	}
	public void setPdCategory(String pdCategory) {
		this.pdCategory = pdCategory;
	}
	
	
	
}
