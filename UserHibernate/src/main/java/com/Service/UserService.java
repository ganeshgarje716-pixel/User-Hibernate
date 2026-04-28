package com.Service;

import com.Dao.UserDao;
import com.entity.User;

public class UserService {
	
	
	UserDao dao=new UserDao();
	
	
	public String save(User user) {
		
		return dao.saveUser(user);
	}

}
