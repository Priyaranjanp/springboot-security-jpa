package com.springbootsecurity.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootsecurity.api.model.User;
import com.springbootsecurity.api.repository.UserRepository;

@RestController
@RequestMapping("/secure/rest")
public class AdminController {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder pwdEncoder;
	
	@PostMapping("/admin/add")
	public String addUserByAdmin(@RequestBody User user) {
		String pwd=user.getPassword();
		String encryptPwd=pwdEncoder.encode(pwd);
		user.setPassword(encryptPwd);
		userRepository.save(user);
		return "user added successfully...";
	}
}
