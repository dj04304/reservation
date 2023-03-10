package com.reservation.reservation_project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;


@EnableWebSecurity
@Configuration
public class SecurityConfig {

	@Bean
	protected SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		
		http.csrf().disable();
		http.authorizeRequests()
				.antMatchers("/admin/**")
				.access("hasRole('ROLE_ADMIN')")
				
				.antMatchers()
				
				.authenticated()
				
				.anyRequest()
				.permitAll()
				
				.and()
				
				.formLogin()
				.loginPage("/signin")
				.loginProcessingUrl("/signin");
		
		return http.build();
		
	}
}
