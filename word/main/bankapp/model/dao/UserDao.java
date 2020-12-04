package com.bankapp.model.dao;

import java.util.List;

public interface UserDao {
	
	public List<User> getAllUsers();
	public User addUser(User user);
	public User deleteUser(User user);
	public User updateUser(int uid, User user);
	public User getUser(String username);
	public User getUserDetails(String username, String password);
	public User getUserById(int accountId);
	

}