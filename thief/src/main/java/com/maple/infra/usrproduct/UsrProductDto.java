package com.maple.infra.usrproduct;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class UsrProductDto {

	private String pddSeq;
	private String pddName;
	private String pddCategory;
	private Integer pddUseNy;
	private Integer pddDelNy;
	private Integer pddOrder;
	private String pddPrice;
	private Integer pddsales;
	private String pddSalesPrice;
	private Integer pddCount;
	private String pddTotalPrice;
	private Date pddDatetime;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date pddDatetimeSvr;
	private Integer pddReview;
	private String pddReviewDesc;
	private String pddDesc;
	private Date pddDatetimeRel;
	private String pddProgramer;
	private String pddDistributor;
	private String pddSystem;
	private String pddDetail;
	private Integer pddPlus;
	private Integer pddWish;
	private String productCg_pdSeq;
	private String pdCategory;
	private String pdSeq;
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
	public String getPdSeq() {
		return pdSeq;
	}
	public void setPdSeq(String pdSeq) {
		this.pdSeq = pdSeq;
	}
	public Integer getPddsales() {
		return pddsales;
	}
	public void setPddsales(Integer pddsales) {
		this.pddsales = pddsales;
	}
	public Integer getPddReview() {
		return pddReview;
	}
	public void setPddReview(Integer pddReview) {
		this.pddReview = pddReview;
	}
	public String getPddReviewDesc() {
		return pddReviewDesc;
	}
	public void setPddReviewDesc(String pddReviewDesc) {
		this.pddReviewDesc = pddReviewDesc;
	}
	public String getPddSalesPrice() {
		return pddSalesPrice;
	}
	public void setPddSalesPrice(String pddSalesPrice) {
		this.pddSalesPrice = pddSalesPrice;
	}
	public Date getPddDatetimeRel() {
		return pddDatetimeRel;
	}
	public void setPddDatetimeRel(Date pddDatetimeRel) {
		this.pddDatetimeRel = pddDatetimeRel;
	}
	public String getPddProgramer() {
		return pddProgramer;
	}
	public void setPddProgramer(String pddProgramer) {
		this.pddProgramer = pddProgramer;
	}
	public String getPddDistributor() {
		return pddDistributor;
	}
	public void setPddDistributor(String pddDistributor) {
		this.pddDistributor = pddDistributor;
	}
	public String getPddSystem() {
		return pddSystem;
	}
	public void setPddSystem(String pddSystem) {
		this.pddSystem = pddSystem;
	}
	public String getPddDetail() {
		return pddDetail;
	}
	public void setPddDetail(String pddDetail) {
		this.pddDetail = pddDetail;
	}
	public Integer getPddPlus() {
		return pddPlus;
	}
	public void setPddPlus(Integer pddPlus) {
		this.pddPlus = pddPlus;
	}
	public Integer getPddWish() {
		return pddWish;
	}
	public void setPddWish(Integer pddWish) {
		this.pddWish = pddWish;
	}
	
	
}
