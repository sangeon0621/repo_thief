package com.maple.infra.usrproduct;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class UsrProductDto {

	private String pddSeq;
	private String pddName;
	private String pddCategory;
	private Integer pddUseNy;
	private Integer pddDelNy;
	private Integer pddSalesNy;
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
	private String psSeq;
	private Integer psSize;
	private String psCpu;
	private String psMemory;
	private String psGrapic;
	private String psOs;
	private String psDirectX;
	private String psNetwork;
	private String psDisk;
	private String pddDetail1;
	private String pddDetail2;
	private String pddDetail3;
	private String pddDetail4;
	private String pddDetail5;
	private String pddDetail6;
	private String pddDetail7;
	private String pddDetail8;
	private String pddDetail9;
	private String pddDetail10;
	private String pddDetail11;
	private String pddDetail12;
	private String pddDetail13;
	private String pddDetail14;
	private String pddDetail15;
	private String pddDetail16;
	private String productCd_pddSeq;
	private String count;
	
	private String prSeq;
	private String prName;
	private Integer prReview;
	private String prReviewDesc;
	private Integer prUseNy;
	private Integer prDelNy;
	private Integer prOrder;
	private Date prDatetime;
	private Date prDatetimeSvr;
	private Integer prReviewAvg;
	
	private String ppSeq;
	private Integer ppPlayer;
	private Integer ppUseNy;
	private Integer ppDelNy;
	
	private String plSeq;
	private String plImage;
	private String plName;
	private Integer plPrice;
	private Integer plCount;
	private Integer plTotalPrice;
	private Integer plDelNy;
	private Date plDatetime;
	private Date plDatetimeSvr;
	private String member_seq;
	
	private String tid; // 결제 고유 번호
    private String next_redirect_mobile_url; // 모바일 웹일 경우 받는 결제페이지 url
    private String next_redirect_pc_url; // pc 웹일 경우 받는 결제 페이지
    private String created_at;
	
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
	public String getPsSeq() {
		return psSeq;
	}
	public void setPsSeq(String psSeq) {
		this.psSeq = psSeq;
	}
	public Integer getPsSize() {
		return psSize;
	}
	public void setPsSize(Integer psSize) {
		this.psSize = psSize;
	}
	public String getPsCpu() {
		return psCpu;
	}
	public void setPsCpu(String psCpu) {
		this.psCpu = psCpu;
	}
	public String getPsMemory() {
		return psMemory;
	}
	public void setPsMemory(String psMemory) {
		this.psMemory = psMemory;
	}
	public String getPsGrapic() {
		return psGrapic;
	}
	public void setPsGrapic(String psGrapic) {
		this.psGrapic = psGrapic;
	}
	public String getPsOs() {
		return psOs;
	}
	public void setPsOs(String psOs) {
		this.psOs = psOs;
	}
	public String getPsDirectX() {
		return psDirectX;
	}
	public void setPsDirectX(String psDirectX) {
		this.psDirectX = psDirectX;
	}
	public String getPsNetwork() {
		return psNetwork;
	}
	public void setPsNetwork(String psNetwork) {
		this.psNetwork = psNetwork;
	}
	public String getPsDisk() {
		return psDisk;
	}
	public void setPsDisk(String psDisk) {
		this.psDisk = psDisk;
	}
	public String getProductCd_pddSeq() {
		return productCd_pddSeq;
	}
	public void setProductCd_pddSeq(String productCd_pddSeq) {
		this.productCd_pddSeq = productCd_pddSeq;
	}
	public String getPddDetail1() {
		return pddDetail1;
	}
	public void setPddDetail1(String pddDetail1) {
		this.pddDetail1 = pddDetail1;
	}
	public String getPddDetail2() {
		return pddDetail2;
	}
	public void setPddDetail2(String pddDetail2) {
		this.pddDetail2 = pddDetail2;
	}
	public String getPddDetail3() {
		return pddDetail3;
	}
	public void setPddDetail3(String pddDetail3) {
		this.pddDetail3 = pddDetail3;
	}
	public String getPddDetail4() {
		return pddDetail4;
	}
	public void setPddDetail4(String pddDetail4) {
		this.pddDetail4 = pddDetail4;
	}
	public String getPddDetail5() {
		return pddDetail5;
	}
	public void setPddDetail5(String pddDetail5) {
		this.pddDetail5 = pddDetail5;
	}
	public String getPddDetail6() {
		return pddDetail6;
	}
	public void setPddDetail6(String pddDetail6) {
		this.pddDetail6 = pddDetail6;
	}
	public String getPddDetail7() {
		return pddDetail7;
	}
	public void setPddDetail7(String pddDetail7) {
		this.pddDetail7 = pddDetail7;
	}
	public String getPddDetail8() {
		return pddDetail8;
	}
	public void setPddDetail8(String pddDetail8) {
		this.pddDetail8 = pddDetail8;
	}
	public String getPddDetail9() {
		return pddDetail9;
	}
	public void setPddDetail9(String pddDetail9) {
		this.pddDetail9 = pddDetail9;
	}
	public String getPddDetail10() {
		return pddDetail10;
	}
	public void setPddDetail10(String pddDetail10) {
		this.pddDetail10 = pddDetail10;
	}
	public String getPddDetail11() {
		return pddDetail11;
	}
	public void setPddDetail11(String pddDetail11) {
		this.pddDetail11 = pddDetail11;
	}
	public String getPddDetail12() {
		return pddDetail12;
	}
	public void setPddDetail12(String pddDetail12) {
		this.pddDetail12 = pddDetail12;
	}
	public String getPddDetail13() {
		return pddDetail13;
	}
	public void setPddDetail13(String pddDetail13) {
		this.pddDetail13 = pddDetail13;
	}
	public String getPddDetail14() {
		return pddDetail14;
	}
	public void setPddDetail14(String pddDetail14) {
		this.pddDetail14 = pddDetail14;
	}
	public String getPddDetail15() {
		return pddDetail15;
	}
	public void setPddDetail15(String pddDetail15) {
		this.pddDetail15 = pddDetail15;
	}
	public String getPddDetail16() {
		return pddDetail16;
	}
	public void setPddDetail16(String pddDetail16) {
		this.pddDetail16 = pddDetail16;
	}
	public String getPrSeq() {
		return prSeq;
	}
	public void setPrSeq(String prSeq) {
		this.prSeq = prSeq;
	}
	public Integer getPrReview() {
		return prReview;
	}
	public void setPrReview(Integer prReview) {
		this.prReview = prReview;
	}
	public String getPrReviewDesc() {
		return prReviewDesc;
	}
	public void setPrReviewDesc(String prReviewDesc) {
		this.prReviewDesc = prReviewDesc;
	}
	public Integer getPrUseNy() {
		return prUseNy;
	}
	public void setPrUseNy(Integer prUseNy) {
		this.prUseNy = prUseNy;
	}
	public Integer getPrDelNy() {
		return prDelNy;
	}
	public void setPrDelNy(Integer prDelNy) {
		this.prDelNy = prDelNy;
	}
	public Integer getPrOrder() {
		return prOrder;
	}
	public void setPrOrder(Integer prOrder) {
		this.prOrder = prOrder;
	}
	public Date getPrDatetime() {
		return prDatetime;
	}
	public void setPrDatetime(Date prDatetime) {
		this.prDatetime = prDatetime;
	}
	public Date getPrDatetimeSvr() {
		return prDatetimeSvr;
	}
	public void setPrDatetimeSvr(Date prDatetimeSvr) {
		this.prDatetimeSvr = prDatetimeSvr;
	}
	public String getPrName() {
		return prName;
	}
	public void setPrName(String prName) {
		this.prName = prName;
	}
	public String getPpSeq() {
		return ppSeq;
	}
	public void setPpSeq(String ppSeq) {
		this.ppSeq = ppSeq;
	}
	public Integer getPpPlayer() {
		return ppPlayer;
	}
	public void setPpPlayer(Integer ppPlayer) {
		this.ppPlayer = ppPlayer;
	}
	public Integer getPpUseNy() {
		return ppUseNy;
	}
	public void setPpUseNy(Integer ppUseNy) {
		this.ppUseNy = ppUseNy;
	}
	public Integer getPpDelNy() {
		return ppDelNy;
	}
	public void setPpDelNy(Integer ppDelNy) {
		this.ppDelNy = ppDelNy;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public Integer getPrReviewAvg() {
		return prReviewAvg;
	}
	public void setPrReviewAvg(Integer prReviewAvg) {
		this.prReviewAvg = prReviewAvg;
	}
	public Integer getPddSalesNy() {
		return pddSalesNy;
	}
	public void setPddSalesNy(Integer pddSalesNy) {
		this.pddSalesNy = pddSalesNy;
	}
	public String getPlSeq() {
		return plSeq;
	}
	public void setPlSeq(String plSeq) {
		this.plSeq = plSeq;
	}
	public String getPlImage() {
		return plImage;
	}
	public void setPlImage(String plImage) {
		this.plImage = plImage;
	}
	public String getPlName() {
		return plName;
	}
	public void setPlName(String plName) {
		this.plName = plName;
	}
	public Integer getPlPrice() {
		return plPrice;
	}
	public void setPlPrice(Integer plPrice) {
		this.plPrice = plPrice;
	}
	public Integer getPlCount() {
		return plCount;
	}
	public void setPlCount(Integer plCount) {
		this.plCount = plCount;
	}
	public Integer getPlTotalPrice() {
		return plTotalPrice;
	}
	public void setPlTotalPrice(Integer plTotalPrice) {
		this.plTotalPrice = plTotalPrice;
	}
	public Integer getPlDelNy() {
		return plDelNy;
	}
	public void setPlDelNy(Integer plDelNy) {
		this.plDelNy = plDelNy;
	}
	public Date getPlDatetime() {
		return plDatetime;
	}
	public void setPlDatetime(Date plDatetime) {
		this.plDatetime = plDatetime;
	}
	public Date getPlDatetimeSvr() {
		return plDatetimeSvr;
	}
	public void setPlDatetimeSvr(Date plDatetimeSvr) {
		this.plDatetimeSvr = plDatetimeSvr;
	}
	public String getMember_seq() {
		return member_seq;
	}
	public void setMember_seq(String member_seq) {
		this.member_seq = member_seq;
	}
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public String getNext_redirect_mobile_url() {
		return next_redirect_mobile_url;
	}
	public void setNext_redirect_mobile_url(String next_redirect_mobile_url) {
		this.next_redirect_mobile_url = next_redirect_mobile_url;
	}
	public String getNext_redirect_pc_url() {
		return next_redirect_pc_url;
	}
	public void setNext_redirect_pc_url(String next_redirect_pc_url) {
		this.next_redirect_pc_url = next_redirect_pc_url;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	
	
	
}
