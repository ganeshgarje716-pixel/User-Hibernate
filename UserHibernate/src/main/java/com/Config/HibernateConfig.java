package com.Config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfig {
	
	
	static Configuration cfg=new Configuration();
	
	public static SessionFactory getSessionFactory() {
		
		cfg.configure();
		
		SessionFactory sessionfactory = cfg.buildSessionFactory();
		
		return sessionfactory;
	}

}
