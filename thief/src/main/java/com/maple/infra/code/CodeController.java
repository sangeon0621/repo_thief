package com.maple.infra.code;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.maple.common.util.UtilDateTime;

import jakarta.servlet.http.HttpSession;

@Controller
public class CodeController {

	@Autowired
	CodeService codeService;
	
	@RequestMapping(value = "/v1/infra/code/codeXdmList")
	public String codeXdmList (@ModelAttribute("vo") CodeVo vo, Model model, HttpSession httpSession) throws IOException {
		vo.setShDateStart(vo.getShDateStart() == null || vo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(vo.getShDateStart()));
		vo.setShDateEnd(vo.getShDateEnd() == null || vo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(vo.getShDateEnd()));
//		vo.setShDateStart(vo.getShDateStart() + "00:00:00");
//		vo.setShDateEnd(vo.getShDateEnd() + "00:00:00");
		
		vo.setParamsPaging(codeService.selectOneCount(vo));
		
		
		if (vo.getTotalRows() > 0) {
			model.addAttribute("list", codeService.selectList2(vo));
		}
		
		model.addAttribute("list", codeService.selectList2(vo));
		
		StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/1471000/CovidDagnsRgntProdExprtStusService/getCovidDagnsRgntProdExprtStusInq"); /*URL*/
	        urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=VmeGq%2FKeIGMMuJWh4ypIDN2QXTdO5zHvZCzLQK1ogxtNdg1eLJN1Mvtasuv%2B1NYU%2FMmOcWgwIJ6VLqmFsniYag%3D%3D"); /*Service Key*/
	        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지 번호*/
	        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("3", "UTF-8")); /*한 페이지 결과 수*/
	        urlBuilder.append("&" + URLEncoder.encode("type","UTF-8") + "=" + URLEncoder.encode("json", "UTF-8")); /*응답데이터 형식(xml/json) default : xml*/
	        urlBuilder.append("&" + URLEncoder.encode("YYYY","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /*년도*/
	        urlBuilder.append("&" + URLEncoder.encode("MM","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /*실적월*/
	        URL url = new URL(urlBuilder.toString());
	        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	        conn.setRequestMethod("GET");
	        conn.setRequestProperty("Content-type", "application/json");
	        System.out.println("Response code: " + conn.getResponseCode());
	        BufferedReader rd;
	        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
	            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	        } else {
	            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
	        }
	        StringBuilder sb = new StringBuilder();
	        String line;
	        while ((line = rd.readLine()) != null) {
	            sb.append(line);
	        }
	        rd.close();
	        conn.disconnect();
	        System.out.println(sb.toString());
	        
	        ObjectMapper objectMapper = new ObjectMapper();
			JsonNode node = objectMapper.readTree(sb.toString());
			
			System.out.println("node.get(\"header\").get(\"resultCode\").asText(): " + node.get("header").get("resultCode").asText());
			System.out.println("node.get(\"header\").get(\"resultMsg\").asText(): " + node.get("header").get("resultMsg").asText());
			System.out.println("node.get(\"header\").get(\"resultMsg\").asText(): " + node.get("body").get("items").get(0).get("KIT_PROD_QTY").asText());
		
		return "xdm/v1/infra/code/codeXdmList";
	}
	
//	@RequestMapping(value = "/v1/infra/code/codeXdmList")
//	public String codeXdmList() {
//		List<CodeDto> codes = codeService.selectList2();
//		
//		for(CodeDto codeDto : codes) {
//			System.out.println(codeDto.getCodeGroup_ifcgSeq() + codeDto.getIfcdName());
//		}
//		
//		return "/xdm/v1/infra/code/codeXdmList";
//	}
	
	@RequestMapping(value = "/v1/infra/code/codeXdmForm")
	public String codeXdmForm(Model model) {
		
		model.addAttribute("listCodeGroup", codeService.selectListCodeGroup());
		
		return "xdm/v1/infra/code/codeXdmForm";
	}
	
	@RequestMapping(value = "/v1/infra/code/codeXdmInst")
	public String codeXdmInst(CodeDto codeDto) {
		codeService.insert(codeDto);
		return "redirect:/v1/infra/code/codeXdmList";
	}
	
	@RequestMapping(value = "/v1/infra/code/codeXdmMForm")
	public String codeXdmMForm(CodeDto codeDto, Model model) {
		model.addAttribute("item", codeService.selectOne(codeDto));
		return "xdm/v1/infra/code/codeXdmMForm";
	}
	
	@RequestMapping(value = "/v1/infra/code/codeXdmUpdt")
	public String codeXdmUpdt(CodeDto codeDto) {
		codeService.update(codeDto);
		return "redirect:/v1/infra/code/codeXdmList";
	}
	
	@RequestMapping(value = "/v1/infra/code/codeXdmUele")
	public String codeXdmUele(CodeDto codeDto) {
		codeService.uelete(codeDto);
		return "redirect:/v1/infra/code/codeXdmList";
	}
	
	@RequestMapping(value = "/v1/infra/code/codeXdmDele")
	public String codeXdmDele(CodeDto codeDto) {
		codeService.delete(codeDto);
		return "redirect:/v1/infra/code/codeXdmList";
	}
	
}
