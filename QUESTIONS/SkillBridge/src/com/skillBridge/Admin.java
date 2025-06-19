package com.skillBridge;

import java.util.List;
import java.util.Scanner;

public class Admin extends User {
 private int id;
 
 
 
 public Admin(String name, String email, long mobile, int id) {
	super(name, email, mobile);
	this.id = id;
}

 
 
public int getId() {
	return id;
}



public void setId(int id) {
	this.id = id;
}



public void postInternship(String title , InternshipCatagory catagory , int duration,List<Internship> internship) {
	 Internship  intern = new Internship(duration, title, catagory, duration);
	 internship.add(intern);
	 System.out.println("Sucessfully Posted: "+title);
 }
 
 public void viewInternship(List<Internship> internship) {
	 System.out.println("List of Intern");
	 
	 for(int i=0;i<internship.size();i++) {
		 Internship i1 = internship.get(i);
		 System.out.println(i1.getId()+"."+i1.getTitle()+":"+i1.getCatagory()+":"+i1.getDuration());
	 }
 }
 
 public void viewApplication(List<Application> app) {
	 System.out.println("Total List Of Application");
	 for(Application a:app) {
		 System.out.println(a.getStudent().getName()+":"+a.getStatus());
	 }
 }
}
