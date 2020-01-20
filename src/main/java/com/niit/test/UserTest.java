package com.niit.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Ignore;
import org.junit.Test;

import com.niit.dao.UserDAO;
import com.niit.daoimpl.UserDAOImpl;
import com.niit.model.User;

public class UserTest
{
	UserDAOImpl udi=new UserDAOImpl();
	
	@Test
	@Ignore
	public void add()
	{
		User u=new User();
		u.setUsername("Rahul");
		u.setEmail("rahul@gmail.com");
		
		assertEquals(true, udi.addUser(u));
	}
	
	@Test
	@Ignore
	public void displaybyid()
	{
		assertNotNull(udi.displayUserById(1));
	}
	
	@Test
	public void displaybyname()
	{
		assertNotNull(udi.displayUserByName("sameer"));
	}
	
	@Test
	@Ignore
	public void displayall()
	{
		assertNotNull(udi.displayUsers());
	}
	
	@Test
	@Ignore
	public void update()
	{
		User u=udi.displayUserById(1);
		u.setUsername("sahil");
		assertNotNull(udi.updateUser(u));
	}
	
	@Test
	@Ignore
	public void delete()
	{
		assertEquals(true, udi.deleteUser(1));
	}
}
