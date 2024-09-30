package com.maple.infra.member;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.maple.common.util.UtilDateTime;

import jakarta.servlet.http.HttpSession;


@Controller
public class MemberController {
	
	@Autowired
	MemberService memberService;
	
	@RequestMapping(value="/v1/infra/member/memberXdmList")
	public String memberXdmList(@ModelAttribute("vo") MemberVo vo, Model model) {
		vo.setShDateStart(vo.getShDateStart() == null || vo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(vo.getShDateStart()));
		vo.setShDateEnd(vo.getShDateEnd() == null || vo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(vo.getShDateEnd()));
//		vo.setShDateStart(vo.getShDateStart()+ " 00:00:00");
//		vo.setShDateEnd(vo.getShDateEnd()+ " 23:59:59");
		
		vo.setParamsPaging(memberService.selectOneCount(vo));
		
		if (vo.getTotalRows() > 0) {
			model.addAttribute("list", memberService.selectList3(vo));
		}
		
		model.addAttribute("list", memberService.selectList3(vo));
		return "/xdm/v1/infra/member/memberXdmList";
	}
	
	@RequestMapping(value = "/v1/infra/member/memberXdmRegister")
	public String memberXdmForm() {
		
		return "/xdm/v1/infra/member/memberXdmRegister";
	}
	
	@RequestMapping(value = "/v1/infra/member/memberXdmInst")
	public String memberXdmInst(MemberDto memberDto) {
		
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
	public String xdmLogin(MemberDto memberDto) {
		memberService.selectOneLogin(memberDto);
		return "/xdm/v1/infra/xdmlogin/xdmLogin";
	}
	
	@RequestMapping(value="/memberXdmindex")
	public String memberXdmindex() {
		return "/xdm/v1/infra/member/memberXdmindex";
	}
	
	
	@ResponseBody
	@RequestMapping(value = "/v1/infra/member/signinXdmProc")
	public Map<String, Object> signinXdmProc(MemberDto memberDto, HttpSession httpSession) throws Exception {
		Map<String, Object> returnMap = new HashMap<String, Object>();

//		MemberDto rtMember = memberService.selectOneId(memberDto);

		memberService.selectOneLogin(memberDto);

//			if (rtMember2 != null) {
				
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

//				httpSession.setMaxInactiveInterval(60 * Constants.SESSION_MINUTE_XDM); // 60second * 30 = 30minute
//				httpSession.setAttribute("sessSeqXdm", rtMember2.getSeq());
//				httpSession.setAttribute("sessIdXdm", rtMember2.getId());
//				httpSession.setAttribute("sessNameXdm", rtMember2.getName());
//
//				rtMember2.setIfmmSocialLoginCd(103);
//				rtMember2.setIflgResultNy(1);
//				memberService.insertLogLogin(rtMember2);

//				returnMap.put("rt", "success");
//			} else {
//				memberDto.setIfmmSocialLoginCd(103);
//				memberDto.setIfmmSeq(rtMember.getIfmmSeq());
//				memberDto.setIflgResultNy(0);
//				memberService.insertLogLogin(memberDto);

//				returnMap.put("rt", "fail");
//			}
//			memberDto.setIfmmSocialLoginCd(103);
//			memberDto.setIflgResultNy(0);
//			memberService.insertLogLogin(memberDto);

		return returnMap;
	}
}
