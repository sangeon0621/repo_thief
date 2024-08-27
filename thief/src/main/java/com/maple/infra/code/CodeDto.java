package com.maple.infra.code;

import java.util.Date;

public class CodeDto {
	
	private String ifcdSeq;
	private String ifcdName;
	private Integer ifcdUseNy;
	private Integer ifcdOrder;
	private String ifcdDesc;
	private Date ifcdDatetime;
	private Date ifcdDatetimeSvr;
	private Integer ifcdDelNy;
	private String codegroup_ifcgSeq;
//	-----
	public String getIfcdSeq() {
		return ifcdSeq;
	}
	public void setIfcdSeq(String ifcdSeq) {
		this.ifcdSeq = ifcdSeq;
	}
	public String getIfcdName() {
		return ifcdName;
	}
	public void setIfcdName(String ifcdName) {
		this.ifcdName = ifcdName;
	}
	public Integer getIfcdUseNy() {
		return ifcdUseNy;
	}
	public void setIfcdUseNy(Integer ifcdUseNy) {
		this.ifcdUseNy = ifcdUseNy;
	}
	public Integer getIfcdOrder() {
		return ifcdOrder;
	}
	public void setIfcdOrder(Integer ifcdOrder) {
		this.ifcdOrder = ifcdOrder;
	}
	public String getIfcdDesc() {
		return ifcdDesc;
	}
	public void setIfcdDesc(String ifcdDesc) {
		this.ifcdDesc = ifcdDesc;
	}
	public Date getIfcdDatetime() {
		return ifcdDatetime;
	}
	public void setIfcdDatetime(Date ifcdDatetime) {
		this.ifcdDatetime = ifcdDatetime;
	}
	public Date getIfcdDatetimeSvr() {
		return ifcdDatetimeSvr;
	}
	public void setIfcdDatetimeSvr(Date ifcdDatetimeSvr) {
		this.ifcdDatetimeSvr = ifcdDatetimeSvr;
	}
	public Integer getIfcdDelNy() {
		return ifcdDelNy;
	}
	public void setIfcdDelNy(Integer ifcdDelNy) {
		this.ifcdDelNy = ifcdDelNy;
	}
	public String getCodegroup_ifcgSeq() {
		return codegroup_ifcgSeq;
	}
	public void setCodegroup_ifcgSeq(String codegroup_ifcgSeq) {
		this.codegroup_ifcgSeq = codegroup_ifcgSeq;
	}
	
	
}
