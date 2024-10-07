package com.maple.infra.usrui;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class UsrDto {

	private String umSeq;
	private String umName;
	private String umNickName;
	private String umId;
	private String umPassword;
	private String umCheckingpassword;
	private String umEmail;
	private String umBirthday;
	private String umTelephone;
	private Date umDatetime;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date umDatetimeSvr;
	private Integer umGender;
	private Integer umDelNy;
//	-----
	public String getUmSeq() {
		return umSeq;
	}
	public void setUmSeq(String umSeq) {
		this.umSeq = umSeq;
	}
	public String getUmName() {
		return umName;
	}
	public void setUmName(String umName) {
		this.umName = umName;
	}
	public String getUmNickName() {
		return umNickName;
	}
	public void setUmNickName(String umNickName) {
		this.umNickName = umNickName;
	}
	public String getUmId() {
		return umId;
	}
	public void setUmId(String umId) {
		this.umId = umId;
	}
	public String getUmPassword() {
		return umPassword;
	}
	public void setUmPassword(String umPassword) {
		this.umPassword = umPassword;
	}
	public String getUmCheckingpassword() {
		return umCheckingpassword;
	}
	public void setUmCheckingpassword(String umCheckingpassword) {
		this.umCheckingpassword = umCheckingpassword;
	}
	public String getUmEmail() {
		return umEmail;
	}
	public void setUmEmail(String umEmail) {
		this.umEmail = umEmail;
	}
	public String getUmBirthday() {
		return umBirthday;
	}
	public void setUmBirthday(String umBirthday) {
		this.umBirthday = umBirthday;
	}
	public String getUmTelephone() {
		return umTelephone;
	}
	public void setUmTelephone(String umTelephone) {
		this.umTelephone = umTelephone;
	}
	public Date getUmDatetime() {
		return umDatetime;
	}
	public void setUmDatetime(Date umDatetime) {
		this.umDatetime = umDatetime;
	}
	public Date getUmDatetimeSvr() {
		return umDatetimeSvr;
	}
	public void setUmDatetimeSvr(Date umDatetimeSvr) {
		this.umDatetimeSvr = umDatetimeSvr;
	}
	public Integer getUmGender() {
		return umGender;
	}
	public void setUmGender(Integer umGender) {
		this.umGender = umGender;
	}
	public Integer getUmDelNy() {
		return umDelNy;
	}
	public void setUmDelNy(Integer umDelNy) {
		this.umDelNy = umDelNy;
	}
	
	
}
