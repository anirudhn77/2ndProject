package com.ani.collabapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ani.collabapibackend.DaoImpl.UserDaoImpl;
import com.ani.collabapibackend.model.User;

@RestController
public class UserController {

	@Autowired
	UserDaoImpl userDaoImpl;
	
	@PostMapping("/adduser")
	public void AddBlog(@RequestBody User user)
	{
		System.out.println(user.getEmail());
		System.out.println(user.getMobileNo());
		System.out.println(user.getMobileNo());
	
       userDaoImpl.addUser(user);
 
	}
	
}
