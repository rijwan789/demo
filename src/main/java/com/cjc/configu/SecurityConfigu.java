package com.cjc.configu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfigu {
	

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/products/public")     // .antMatchers("/products/**")  -> allow all /products requests
		.permitAll()
		.anyRequest()
		.authenticated()
		.and()
		.formLogin()
		.permitAll();
		return http.build();
	}

}
