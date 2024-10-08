package com.maple.common.config;

import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.maple.common.interceptor.CheckLoginSessionInterceptor;

public class WebMvcConfigurerImpl implements WebMvcConfigurer {
	
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new CheckLoginSessionInterceptor()) // 인터셉터 연결 
//				.order(1)
				.addPathPatterns("/xdm/v1/infra/**") // 인터셉터를 적용할 패턴 지정   
				.excludePathPatterns( // 인터셉터에서 제외할 패턴 지정(예외 처리)
   					    "/resources/**", 
//						"/xdm/v1/**", // resources 하위 폴더
						"/xdm/v1/infra/xdmlogin/xdmlogin", // 로그인 페이지 제외 
						"/xdm/v1/infra/member/signinXdmProc" // 로그인 처리 페이지 제외 
				);
	}   
	
}
