package com.tranning.cdac.springWebForm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloworldController {
	@RequestMapping("/gotocontroller")
	public String showgreet()
	{
		return "HelloWorld";
	}
	@RequestMapping("/gototestcontroller")
	public String test()
	{
		return "test";
	}

}
