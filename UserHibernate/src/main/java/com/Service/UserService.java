package com.Service;

import java.util.List;

import com.Dao.UserDao;
import com.Exception.UserNotFoundException;
import com.entity.User;

public class UserService {
	
	
	UserDao dao=new UserDao();
	
	
	public String save(User user) {
		
		return dao.saveUser(user);
	}
	
	
	
	public User get(int id) {
		
		 User user = dao.getUser(id);
		 
		 if (user == null) {
			 
			throw new UserNotFoundException("User Not Found with Id = "+ id);
		}
		 
		 return user;
	}

	
	
	public List<User> getAll() {
		
		return dao.getAllUsers();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
