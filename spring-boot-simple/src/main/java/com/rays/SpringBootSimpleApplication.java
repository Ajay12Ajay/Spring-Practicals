package com.rays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.rays.common.FrontCtl;

@SpringBootApplication
public class SpringBootSimpleApplication {

	/*
	 * @Autowired private FrontCtl frontCtl;
	 */

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSimpleApplication.class, args);
		System.out.println("SB app started in port no : 8081");
	}

	/*
	 * @Bean public WebMvcConfigurer webConfig() { return new WebMvcConfigurer() {
	 * 
	 * @Override public void addInterceptors(InterceptorRegistry registry) { // TODO
	 * Auto-generated method stub
	 * registry.addInterceptor(frontCtl).addPathPatterns("/**").excludePathPatterns(
	 * "/auth/**"); } }; }
	 */
}
