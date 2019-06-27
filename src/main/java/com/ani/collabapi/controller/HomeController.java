package com.ani.collabapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	
	HomeController()
	{
		System.out.println("in HomeController");
	}
	@RequestMapping("/testing")
	public String test()
	{
		return "home";
	}

}
