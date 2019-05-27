package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.User;

@Controller
@RequestMapping("/inputuserinfo")
public class UserInfoController {
	@RequestMapping("")
	public String index() {
		return "inputuserinfo";
	}
	@RequestMapping("/outputuserinfo")
	public String outputUserInfo(User user,Model model) {
		model.addAttribute("user",user);
		return "outputuserinfo";
	}
}
