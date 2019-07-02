package com.ani.collabapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ani.collabapibackend.DaoImpl.BlogDaoImpl;
import com.ani.collabapibackend.model.Blog;


@RestController
public class BlogController {
	
	@Autowired
	BlogDaoImpl blogDaoImpl;
	   
	BlogController()
	{
		System.out.println("in BlogController");
	}
	
	public void goTOBlogFrom()
	{
		
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
	@PostMapping("/addblog")
	public void AddBlog(@RequestBody Blog blog)
	{
		System.out.println(blog.getBlogname());
		System.out.println(blog.getTitle());
		System.out.println(blog.getOwner());
	
        blogDaoImpl.addBlog(blog);
 
	}
	@RequestMapping("/viewblog")
	public List<Blog> viewBlog()
	{
		List<Blog> list=blogDaoImpl.getAllBlogs();
		for (Blog blog : list) {
			System.out.println(blog.getBlogname());
		}
		return list;
	}
}