package com.maple.infra.usrui;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpSession;

@Controller
public class UsrUiController {
	
	@Autowired
	UsrService usrService;

	@RequestMapping(value="/usrUi")
	public String usrUi() {
		return "/usr/v1/infra/usrui/usrUi";
	}
	
	@RequestMapping(value="/usrMypage")
	public String usrMyPage() {
		return "/usr/v1/infra/usrui/usrMyPage";
	}
	
	@RequestMapping(value="/v1/infra/usrui/usrBuyList")
	public String usrBuyList() {
		return "/usr/v1/infra/usrui/usrBuyList";
	}
	
	@RequestMapping(value="/v1/infra/usrui/usrCart")
	public String usrCart() {
		return "/usr/v1/infra/usrui/usrCart";
	}
	
	
	
	@RequestMapping(value="/usrLogin")
	public String usrLogin() {
		return "/usr/v1/infra/usrui/usrLogin";
	}
	
	@RequestMapping(value="/usrRegister") 
	public String usrRegister() {
		
		return "/usr/v1/infra/usrui/usrRegister";
	}
	
	@RequestMapping(value="/usrInst") 
	public String usrInst(UsrDto usrDto) {
		usrService.insert(usrDto);
		
		return "redirect:/usrLogin";
	}
	
	@ResponseBody
	@RequestMapping(value = "/signinUsrProc")
	public Map<String, Object> signinUsrProc(UsrDto usrDto, HttpSession httpSession) throws Exception {
		Map<String, Object> returnMap = new HashMap<String, Object>();
//		MemberDto rtMember = memberService.selectOneId(memberDto);

		UsrDto rtMember2 = usrService.selectOneLogin(usrDto);

			if (rtMember2 != null) {
				
//				if(dto.getAutoLogin() == true) {
//					UtilCookie.createCookie(
//							Constants.COOKIE_SEQ_NAME_XDM, 
//							rtMember2.getIfmmSeq(), 
//							Constants.COOKIE_DOMAIN_XDM, 
//							Constants.COOKIE_PATH_XDM, 
//							Constants.COOKIE_MAXAGE_XDM);
//				} else {
//					// by pass
//				}

				httpSession.setMaxInactiveInterval(60 * 30); // 60second * 30 = 30minute
				httpSession.setAttribute("sessSeqUsr", rtMember2.getSeq());
				httpSession.setAttribute("sessIdUsr", rtMember2.getId());
				httpSession.setAttribute("sessNameUsr", rtMember2.getName());
//
//				rtMember2.setIfmmSocialLoginCd(103);
//				rtMember2.setIflgResultNy(1);
//				memberService.insertLogLogin(rtMember2);

				returnMap.put("rt", "success");
			} else {
//				memberDto.setIfmmSocialLoginCd(103);
//				memberDto.setIfmmSeq(rtMember.getIfmmSeq());
//				memberDto.setIflgResultNy(0);
//				memberService.insertLogLogin(memberDto);
				returnMap.put("rt", "fail");
			}
//			memberDto.setIfmmSocialLoginCd(103);
//			memberDto.setIflgResultNy(0);
//			memberService.insertLogLogin(memberDto);

		return returnMap;
	}
	
	@ResponseBody
	@RequestMapping(value = "/signoutUsrProc")
	public Map<String, Object> signoutUsrProc(HttpSession httpSession) throws Exception {
		Map<String, Object> returnMap = new HashMap<String, Object>();
		httpSession.invalidate();
		returnMap.put("rt", "success");
		return returnMap;
	}
	
}
