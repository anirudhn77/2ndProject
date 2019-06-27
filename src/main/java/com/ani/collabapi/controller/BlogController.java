package com.ani.collabapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ani.collabapi.model.Blog;

@RestController
public class BlogController {
	   
	BlogController()
	{
		System.out.println("in BlogController");
	}
	
	@RequestMapping("/getblog")
	public List<Blog> getAllBlogs()
	{
		Blog blog1=new Blog();
		Blog blog2=new Blog();
		
		blog1.setBlogname("abc");
		blog1.setOwner("a");
		blog1.setTitle("ab");
		blog2.setBlogname("bbc");
		blog2.setOwner("b");
		blog2.setTitle("bc");
		
		List<Blog> blogList=new ArrayList<Blog>(); 
		blogList.add(blog1);
		blogList.add(blog2);
		return blogList;

}
}