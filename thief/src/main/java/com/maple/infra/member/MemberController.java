package com.maple.infra.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.maple.common.util.UtilDateTime;


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
	
}
