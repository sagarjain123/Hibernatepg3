package com.om.sai.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.om.sai.dto.InstititueDTO;

public class InstititueDAO {
	
	public InstititueDAO() {
		System.out.println("institutedao is created ");
	}
	  
	public void SaveInstititue(InstititueDTO InstititueDTO)
	
	{
		Configuration configuration=new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(InstititueDTO.class);
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(InstititueDTO);
		transaction.commit();
		session.close();
		factory.close();
	}
	
	public void updateInstititue(InstititueDTO InstititueDTO)
	{
		Configuration configuration=new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(InstititueDTO.class);
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.update(InstititueDTO);
		transaction.commit();
		session.close();
		factory.close();
	}
	
	
}
