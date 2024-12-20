package com.maple.infra.member;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.maple.common.util.UtilDateTime;
import com.maple.infra.mail.MailService;

import jakarta.servlet.http.HttpSession;


@Controller
public class MemberController {
	
	@Autowired
	MemberService memberService;
	
	@Autowired
	MailService mailService;
	
	public String encodeBcrypt(String planeText, int strength) {
		  return new BCryptPasswordEncoder(strength).encode(planeText);
	}

			
	public boolean matchesBcrypt(String planeText, String hashValue, int strength) {
	  BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(strength);
	  return passwordEncoder.matches(planeText, hashValue);
	}	
	
	@RequestMapping(value="/v1/infra/member/memberXdmList")
	public String memberXdmList(@ModelAttribute("vo") MemberVo vo, Model model) {
		vo.setShDateStart(vo.getShDateStart() == null || vo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(vo.getShDateStart()));
		vo.setShDateEnd(vo.getShDateEnd() == null || vo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(vo.getShDateEnd()));
//		vo.setShDateStart(vo.getShDateStart()+ " 00:00:00");
//		vo.setShDateEnd(vo.getShDateEnd()+ " 23:59:59");
		
//		mailService.sendMailSimple();
		
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				mailService.sendMailSimple();
			}
		});
		
		thread.start();
		
		vo.setParamsPaging(memberService.selectOneCount(vo));
		
		if (vo.getTotalRows() > 0) {
			model.addAttribute("list", memberService.selectList3(vo));
		}
		
		model.addAttribute("list", memberService.selectList3(vo));
		return "xdm/v1/infra/member/memberXdmList";
	}
	
	@RequestMapping(value = "/v1/infra/member/memberXdmRegister")
	public String memberXdmForm() {
		
		return "xdm/v1/infra/member/memberXdmRegister";
	}
	
	@RequestMapping(value = "/v1/infra/member/memberXdmInst")
	public String memberXdmInst(MemberDto memberDto) {
		
		memberDto.setPassword(encodeBcrypt(memberDto.getPassword(), 10));
		
		memberService.insert2(memberDto);
		
		return "redirect:/v1/infra/member/memberXdmList";
	}
	
	@RequestMapping(value = "/v1/infra/member/memberXdmMForm")
	public String memberXdmMForm(MemberDto memberDto, Model model) {
		model.addAttribute("item",memberService.selectOne2(memberDto));
		return "/xdm/v1/infra/member/memberXdmMForm";
	}
	
	@RequestMapping(value = "/v1/infra/member/memberXdmUpdt")
	public String memberXdmUpdt(MemberDto memberDto) {
		
		memberService.update2(memberDto);
		
		return "redirect:/v1/infra/member/memberXdmList";
	}
	
	@RequestMapping(value = "/v1/infra/member/memberXdmUele")
	public String codeGroupXdmUele(MemberDto memberDto, Model model) {
		memberService.uelete2(memberDto);
		return "redirect:/v1/infra/member/memberXdmList";
	}
	
	@RequestMapping(value = "/v1/infra/member/memberXdmDele")
	public String codeGroupXdmDele(MemberDto memberDto) {
		memberService.delete2(memberDto);
		
		return "redirect:/v1/infra/member/memberXdmList";
	}
	
	@RequestMapping(value="/xdmLogin")
	public String xdmLogin() {
		return "xdm/v1/infra/xdmlogin/xdmLogin";
	}
	
	@RequestMapping(value="/v1/infra/member/memberXdmindex")
	public String memberXdmindex() {
		return "xdm/v1/infra/member/memberXdmindex";
	}
	
	
	@ResponseBody
	@RequestMapping(value = "/v1/infra/member/signinXdmProc")
	public Map<String, Object> signinXdmProc(MemberDto memberDto, HttpSession httpSession) throws Exception {
		Map<String, Object> returnMap = new HashMap<String, Object>();
//		MemberDto rtMember = memberService.selectOneId(memberDto);

		MemberDto rtMember2 = memberService.selectOneLogin(memberDto);

			if (rtMember2 != null) {
				
				if(matchesBcrypt(memberDto.getPassword(), rtMember2.getPassword(), 10)) {
				
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
				httpSession.setAttribute("sessSeqXdm", rtMember2.getSeq());
				httpSession.setAttribute("sessIdXdm", rtMember2.getId());
				httpSession.setAttribute("sessNameXdm", rtMember2.getName());
//
//				rtMember2.setIfmmSocialLoginCd(103);
//				rtMember2.setIflgResultNy(1);
//				memberService.insertLogLogin(rtMember2);

				returnMap.put("rt", "success");
				} else {
					returnMap.put("rt", "fail");
				}
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
	@RequestMapping(value = "/signoutXdmProc")
	public Map<String, Object> signoutXdmProc(HttpSession httpSession) throws Exception {
		Map<String, Object> returnMap = new HashMap<String, Object>();
		httpSession.invalidate();
		returnMap.put("rt", "success");
		return returnMap;
	}

}
