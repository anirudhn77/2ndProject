package com.ani.collabapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ani.collabapibackend.DaoImpl.JobDaoImpl;
import com.ani.collabapibackend.model.Jobs;

@RestController
public class JobController {
	@Autowired
	JobDaoImpl jobDaoImpl;
	
	JobController()
	{
		System.out.println("in JobController");
	}
	
	@RequestMapping("/getjobs")
	public List<Jobs> getAlljobs()
	{
		Jobs jobs1=new Jobs();
		Jobs jobs2=new Jobs();

		jobs1.setJobRole("JvDvlp");
		jobs1.setCompanyName("qual");
		jobs1.setJobDescription("app devlpr");
		jobs1.setSalary("3.5");

		jobs2.setJobRole("Pythndvp");
		jobs2.setCompanyName("dell");
		jobs2.setJobDescription("testing");
		jobs2.setSalary("3.8");
		
		
		List<Jobs> jobList=new ArrayList<Jobs>(); 
		jobList.add(jobs1);
		jobList.add(jobs2);
		return jobList;

}
	@PostMapping("/addjob")
	public void addJob(@RequestBody Jobs jobs)
	{
		System.out.println(jobs.getJobRole());
		System.out.println(jobs.getCompanyName());
		System.out.println(jobs.getJobRole());
		jobDaoImpl.addJob(jobs);
	}

}
