package com.maple.infra.test.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberTableController {

	@Autowired
	MemberTableService memberTableService;
	
	@RequestMapping(value = "/infra/memberTable/memberTable")
	public String memberTable() {
		List<MemberTableDto> members = memberTableService.selectList3();
		
		for(MemberTableDto memberTableDto : members) {
			System.out.println(memberTableDto.getIfmtName());
		}
		return "/v1/infra/memberTable/memberTable";
	}
	
}
