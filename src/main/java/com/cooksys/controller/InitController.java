package com.cooksys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InitController {
	
	@RequestMapping("/")
	String getWelcomePage()
	{
		return "init";
	}
}
