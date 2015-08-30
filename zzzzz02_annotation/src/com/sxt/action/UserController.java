package com.sxt.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sxt.service.UserService;

@Component
@RequestMapping("/user.do")
public class UserController{

	@Resource
	private UserService userService;
	
	@RequestMapping(params="method=reg")
	public String reg(String uname){
		System.out.println("UserController.reg()");
		System.out.println("uname:" + uname);
		userService.add(uname);
		//返回字符串index可以直接跳转到index.jsp
		//因为我们在springmvc-servlet中定义了后缀.jsp
		return "index";
	}
	
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	
}
