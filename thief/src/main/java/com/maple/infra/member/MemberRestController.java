package com.maple.infra.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/rest/member")
public class MemberRestController {

	@Autowired
	MemberService service;
	
//	@RequestMapping(value = "", method = RequestMethod.GET)
	@GetMapping("")
	public List<MemberDto> selectList(MemberVo vo) throws Exception {
		List<MemberDto> list = service.selectList3(vo);
		System.out.println(list+"@@@@@@@@@@@@@");
		return list;
	}
	
	
	@GetMapping("/{seq}")
	public MemberDto selectOne(MemberDto memberDto) throws Exception {
		MemberDto item = service.selectOne2(memberDto);
		return item;
	}
	
}
