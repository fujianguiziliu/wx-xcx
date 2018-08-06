package com.dayi.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dayi.entity.User;
import com.dayi.service.impl.UserService;
import com.google.gson.Gson;

@Controller
public class UserController {
	@Autowired
	UserService userService;
	
	@RequestMapping("user")
	public void test(HttpServletRequest request,HttpServletResponse response) throws IOException{
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		List<User> allUser = userService.getAllUser();
		Gson gson = new Gson();
		response.getWriter().write(gson.toJson(allUser));
	}
	@RequestMapping("edit")
	public void test_edit(HttpServletRequest request,HttpServletResponse response) throws Exception{
		request.setCharacterEncoding("utf-8");
		/* 设置响应头允许ajax跨域访问 */  
        response.setHeader("Access-Control-Allow-Origin", "*");  
        /* 星号表示所有的异域请求都可以接受， */  
        response.setHeader("Access-Control-Allow-Methods", "GET,POST");  
		String uname = request.getParameter("uname");
		String unick = request.getParameter("unick");
		String id = request.getParameter("id");
		String usex = request.getParameter("usex");
		String upassword = request.getParameter("upassword");
		String uage = request.getParameter("uage");
		System.err.println(uage+"11111111111111"+uname);
		User user = new User();
		user.setUname(uname);
		user.setId(Integer.parseInt(id));
		user.setUage(Integer.parseInt(uage));
		user.setUnick(unick);
		user.setUpassword(upassword);
		user.setUsex(usex);
		userService.saveUser(user);
	}
	
	@RequestMapping("delete")
	public void test_delete(HttpServletRequest request,HttpServletResponse response) throws Exception{
		request.setCharacterEncoding("utf-8");			
		userService.deleteUser(6L);
		
		
	}
	@RequestMapping("update")
	public void test_update(HttpServletRequest request,HttpServletResponse response) throws Exception{
		request.setCharacterEncoding("utf-8");
		User user = new User();
		user.setId(2);
		user.setUage(35);
		user.setUname("hahaha");
		user.setUsex("男");
		user.setUnick("hehe");
		user.setUpassword("1100");
		userService.updateUser(user);
		
		
		
	}
	@RequestMapping("getUserById")
	public void test_getUserById(HttpServletRequest request,HttpServletResponse response) throws Exception{
		request.setCharacterEncoding("utf-8");	
		User userById = userService.getUserById(5);
		//System.out.println(userService.getUserById(1));
		Gson gson = new Gson();
		response.getWriter().write(gson.toJson(userById));
		
	}
	@RequestMapping("getUserByUnameByUpassword")
	public void test_getUserByUnameByUpassword(HttpServletRequest request,HttpServletResponse response) throws Exception{
		request.setCharacterEncoding("utf-8");
		String uname = request.getParameter("uname");
		String upassword = request.getParameter("upassword");
		User user= userService.getUserByUnameByUpassword(uname,upassword);
		Gson gson = new Gson();
		response.getWriter().write(gson.toJson(user));
		
		
	}
}
