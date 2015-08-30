package com.sxt.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.sxt.service.UserService;

public class UserController implements Controller {

	private UserService userService;
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest req,
			HttpServletResponse resp) throws Exception {
		System.out.println("HelloController.handleRequest()");
		req.setAttribute("a", "aaaa");
		userService.add(req.getParameter("uname")); 
		//意味着user.do的操作完成以后，进入index.jsp页面。
		return new ModelAndView("index");
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	
}
