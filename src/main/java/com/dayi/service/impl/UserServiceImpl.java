package com.dayi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dayi.entity.User;
import com.dayi.mapper.UserMapper;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;
	
	@Override
	public User getUserByUnameByUpassword(String uname, String upassword) {
		return userMapper.getUserByUnameByUpassword(uname, upassword);
	}

	@Override
	public List<User> getAllUser() {
		return userMapper.getAllUser();
	}

	@Override
	public void saveUser(User user) {
		userMapper.saveUser(user);
	}

	@Override
	public void deleteUser(Long id) {
		userMapper.deleteUser(id);		
	}

	@Override
	public void updateUser(User user) {
		userMapper.updateUser(user);
	}

	

	@Override
	public User getUserById(int id) {
		
		return userMapper.getUserById(id);
	}

	
}
