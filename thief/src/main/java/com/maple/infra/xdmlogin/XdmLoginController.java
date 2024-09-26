package com.maple.infra.xdmlogin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class XdmLoginController {

	@RequestMapping(value="/xdmLogin")
	public String xdmLogin() {
		return "/xdm/v1/infra/xdmlogin/xdmLogin";
	}
	
}
