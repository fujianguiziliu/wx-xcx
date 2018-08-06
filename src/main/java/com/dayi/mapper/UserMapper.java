package com.dayi.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.dayi.entity.User;

@Repository
public interface UserMapper {
	public void saveUser(User user);
	public void deleteUser(Long id);
	public void updateUser(User user);
	public User getUserByUnameByUpassword(String uname,String upassword);
	public User getUserById(Integer id); 
	public List<User> getAllUser();
}
