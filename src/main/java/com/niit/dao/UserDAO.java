package com.niit.dao;

import java.util.List;

import com.niit.model.User;

public interface UserDAO 
{
	public boolean addUser(User user);
	public boolean deleteUser(int id);
	public boolean updateUser(User user);
	public List<User> displayUsers();
	public User displayUserById(int id);
	public User displayUserByName(String name);
}
