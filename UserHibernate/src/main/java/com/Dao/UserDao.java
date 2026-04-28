package com.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Config.HibernateConfig;
import com.entity.User;

public class UserDao {

	

		SessionFactory sf=HibernateConfig.getSessionFactory();
	
	
	
	public String saveUser(User user) {
		
		
		Session session = sf.openSession();  // save, update, delete, get
		
		Transaction tr  = session.beginTransaction(); // insert, update, delete
		
//		session.save(user);
		
		session.persist(user);
		
		tr.commit();
		
		session.close();
		
		return "User Register Successfully";
	}
	
	
	public User getUser(int id) {
		
		Session session = sf.openSession(); // save, update, delete, get
		
		User user = session.get(User.class, id);
		
		return user;
	}
	
	
	

	public List<User> getAllUsers() {
		
		Session session = sf.openSession();
		
		List<User> user = session.createQuery("from User").list();
		
        return user;	
	}
	
	
	
	
	
	
	
}
