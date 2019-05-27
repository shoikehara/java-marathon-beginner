package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/inputuserinfo")
public class UserInfoController {
	@RequestMapping("")
	public String index() {
		return "inputuserinfo";
	}
	@RequestMapping("/outputuserinfo")
	public String outputUserInfo(String name,Integer age,String address,Model model) {
		model.addAttribute("name",name);
		model.addAttribute("age",age);
		model.addAttribute("address",address);
		return "outputuserinfo";
	}
}
