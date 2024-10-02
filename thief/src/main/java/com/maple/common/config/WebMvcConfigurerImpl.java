package com.maple.common.config;

import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.maple.common.interceptor.CheckLoginSessionInterceptor;

public class WebMvcConfigurerImpl implements WebMvcConfigurer {
	
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new CheckLoginSessionInterceptor())
//				.order(1)
				.addPathPatterns("/*/*/*/*Xdm*")
				.excludePathPatterns(
//						"/resources/**",
						"/usr/**",
						"/xdm/**",
						"/v1/infra/member/memberXdmRegister",
						"/xdmLogin",
						"/v1/infra/member/signinXdmProc"
		);
	}
	
}
