package com.dayi.service.impl;

import java.util.List;

import com.dayi.entity.User;

public interface UserService {
	public User getUserByUnameByUpassword(String uname,String upassword);
	public List<User> getAllUser();
	public void saveUser(User user);
	public void deleteUser(Long id);
	public void updateUser(User user);
	public User getUserById(int id); 
}
	
