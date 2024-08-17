package com.practise.loginpage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testdemo {
@RequestMapping("/gotest")
public String t()
{
	return "test";
}
}
