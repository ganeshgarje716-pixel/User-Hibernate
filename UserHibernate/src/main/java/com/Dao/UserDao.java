package com.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Config.HibernateConfig;
import com.entity.User;

public class UserDao {

	

		SessionFactory sf=HibernateConfig.getSessionFactory();
	
	
	
	public String saveUser(User user) {
		
		
		Session session = sf.openSession();
		
		Transaction tr  = session.beginTransaction();
		
//		session.save(user);
		
		session.persist(user);
		
		tr.commit();
		
		session.close();
		
		return "User Register Successfully";
	}
	
	
	public void getUser(int id) {
		
		Session session = sf.openSession();
		
		User user = session.get(User.class, id);
		
		return 
	}
	
	
	
	
	
	
	
}
