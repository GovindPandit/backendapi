package com.niit.daoimpl;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.niit.backend.HibernateUtil;
import com.niit.dao.UserDAO;
import com.niit.model.User;

public class UserDAOImpl implements UserDAO 
{
	public boolean addUser(User user)
	{
		Session session=HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		session.save(user);
		tx.commit();
		return true;
	}

	public boolean deleteUser(int id) 
	{
		User u=new User();
		u.setUserid(id);
		Session session=HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		session.delete(u);
		tx.commit();
		return true;
	}

	public boolean updateUser(User user) 
	{
		Session session=HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		session.update(user);
		tx.commit();
		return true;
	}

	public List<User> displayUsers() 
	{
		Session session=HibernateUtil.getSession();
		return session.createQuery("from com.niit.model.User").getResultList();
	}

	public User displayUserById(int id)
	{
		try
		{
			Session session=HibernateUtil.getSession();
			Query query=session.createQuery("from com.niit.model.User where userid= :userid");
			query.setParameter("userid", id);
			return (User)query.getResultList().get(0);
		}
		catch (Exception e) 
		{
			return null;
		}
	}

	public User displayUserByName(String name) 
	{
		try
		{
			Session session=HibernateUtil.getSession();
			Query query=session.createQuery("from com.niit.model.User where username= :username");
			query.setParameter("username", name);
			return (User)query.getResultList().get(0);
		}
		catch (Exception e) 
		{
			return null;
		}
	}
	
	

}
