package com.test.UserManage.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.test.UserManage.service.UserService;
import com.test.UserManage.entity.User;

public class UserQueryAction extends ActionSupport{
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public String execute(){
		List<User> userlist=userService.findAll();
		
		ServletActionContext.getRequest().setAttribute("userlist", userlist);
		return SUCCESS;
	}
}
