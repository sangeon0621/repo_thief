package com.maple.infra.test.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberTableController {

	@Autowired
	MemberTableService memberTableService;
	
	@RequestMapping(value = "/infra/memberTable/memberTable")
	public String memberTable(Model model) {
		
		model.addAttribute("list3", memberTableService.selectList3());
		
		return "/v1/infra/memberTable/memberTable";
	}
	
//	@RequestMapping(value = "/infra/memberTable/memberTable")
//	public String memberTable() {
//		List<MemberTableDto> members = memberTableService.selectList3();
//		
//		for(MemberTableDto memberTableDto : members) {
//			System.out.println(memberTableDto.getIfmtName());
//		}
//		return "/v1/infra/memberTable/memberTable";
//	}
	
	@RequestMapping(value = "/infra/memberTable/memberTableForm")
	public String memberTableForm() {
		return "/v1/infra/memberTable/memberTableForm";
	}
	
	@RequestMapping(value = "/infra/memberTable/memberTableInst")
	public String memberTableInst(MemberTableDto memberTableDto) {
		memberTableService.insert3(memberTableDto);
		return "redirect:/infra/memberTable/memberTable";
	}
	
	@RequestMapping(value = "/infra/memberTable/memberTableMForm")
	public String memberTableMForm(MemberTableDto memberTableDto, Model model) {
		model.addAttribute("item", memberTableService.selectOne(memberTableDto));
		return "/v1/infra/memberTable/memberTableMForm";
	}
	
	@RequestMapping(value = "/infra/memberTable/memberTableUpdt")
	public String memberTableUpdt(MemberTableDto memberTableDto) {
		memberTableService.update(memberTableDto);
		return "redirect:/infra/memberTable/memberTable";
	}
	
}
