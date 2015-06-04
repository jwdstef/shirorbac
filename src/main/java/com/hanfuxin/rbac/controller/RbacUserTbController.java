package com.hanfuxin.rbac.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hanfuxin.rbac.model.RbacUserTb;
import com.hanfuxin.rbac.service.RbacUserTbService;

@Controller
@RequestMapping("/userController")
public class RbacUserTbController {
	@Autowired
	private RbacUserTbService userService;

	@RequestMapping("{id}/showUser")
	public String showUser(@PathVariable String id, HttpServletRequest request) {
		RbacUserTb user = userService.getUserById(id);
		request.setAttribute("user", user);
		return "rbacApp/showUser";
	}
}
