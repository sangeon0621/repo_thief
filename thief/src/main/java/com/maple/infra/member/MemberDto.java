package com.maple.infra.member;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class MemberDto {

	private String seq;
	private String name;
	private String nickName;
	private String id;
	private String password;
	private String checkingpassword;
	private String email;
	private String birthday;
	private String telephone;
	private Date memberDatetime;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date memberDatetimeSvr;
	private Integer gender;
	private Integer admNy;
	private Integer delNy;
//	-----
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCheckingpassword() {
		return checkingpassword;
	}
	public void setCheckingpassword(String checkingpassword) {
		this.checkingpassword = checkingpassword;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public Date getMemberDatetime() {
		return memberDatetime;
	}
	public void setMemberDatetime(Date memberDatetime) {
		this.memberDatetime = memberDatetime;
	}
	public Date getMemberDatetimeSvr() {
		return memberDatetimeSvr;
	}
	public void setMemberDatetimeSvr(Date memberDatetimeSvr) {
		this.memberDatetimeSvr = memberDatetimeSvr;
	}
	public Integer getDelNy() {
		return delNy;
	}
	public void setDelNy(Integer delNy) {
		this.delNy = delNy;
	}
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public Integer getAdmNy() {
		return admNy;
	}
	public void setAdmNy(Integer admNy) {
		this.admNy = admNy;
	}
	
	
	
}
