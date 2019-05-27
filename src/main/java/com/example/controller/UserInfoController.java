package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.form.UserForm;

@Controller
@RequestMapping("/inputuserinfo")
public class UserInfoController {
	@ModelAttribute
	public UserForm setUpForm() {
		return new UserForm();
	}
	
	@RequestMapping("")
	public String index() {
		return "inputuserinfo";
	}
	@RequestMapping("/outputuserinfo")
	public String outputUserInfo(UserForm form,Model model) {
		model.addAttribute("user",form);
		return "outputuserinfo";
	}
}
