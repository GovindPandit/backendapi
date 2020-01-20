package com.niit.backend;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.niit.model.User;

public class HibernateUtil 
{
	private static SessionFactory factory;
	
	static
	{
		loadSessionFactory();
	}
	
	public static void loadSessionFactory()
	{
		Configuration cfg=new Configuration();
		cfg.addAnnotatedClass(User.class);
		cfg.configure("hibernate.cfg.xml");
		ServiceRegistry registry=new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
		factory=cfg.buildSessionFactory(registry);
	}
	
	public static Session getSession()
	{
		return factory.openSession();
	}
}
