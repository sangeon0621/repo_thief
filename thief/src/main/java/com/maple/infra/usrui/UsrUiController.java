package com.maple.infra.usrui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsrUiController {

	@RequestMapping(value=("/usrUi"))
	public String usrUi() {
		return "/xdm/v1/infra/usrui/usrUi";
	}
	
}
