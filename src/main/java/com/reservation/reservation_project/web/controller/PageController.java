package com.reservation.reservation_project.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

	@GetMapping("/signin")
	public String loadSignin() {
		return "signin";
	}
}
