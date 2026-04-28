package com.Cntroller;

import java.awt.desktop.UserSessionEvent;
import java.util.List;

import com.Service.UserService;
import com.entity.User;

public class UserController {
	
	
	UserService service=new UserService();
	
	
	public String save(User user) {
		
		return service.save(user);
	}
	
	
	public User get(int id) {
		
		return service.get(id);
	}
	
	
	public List<User> getAll(){
		
		return service.getAll();
	}
	
	

}
