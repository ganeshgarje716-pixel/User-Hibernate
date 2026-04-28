package com.Cntroller;

import java.awt.desktop.UserSessionEvent;

import com.Service.UserService;
import com.entity.User;

public class UserController {
	
	
	UserService service=new UserService();
	
	
	public String save(User user) {
		
		return service.save(user);
	}

}
