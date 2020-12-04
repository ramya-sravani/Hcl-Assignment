package com.zooapp;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

public class HibernateSessionFactory {
	
	
	private HibernateSessionFactory() {}
	private static SessionFactory factory = null;
	
	public static SessionFactory getSessionFactory() {
		
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		factory = new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory();
		return factory;
	}

}

