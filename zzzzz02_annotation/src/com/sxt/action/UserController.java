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
		//�����ַ���index����ֱ����ת��index.jsp
		//��Ϊ������springmvc-servlet�ж����˺�׺.jsp
		return "index";
	}
	
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	
}
