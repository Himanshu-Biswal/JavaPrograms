package com.skillBridge;

import java.util.List;

public class Student extends User{
	 private int id;
	 private double cgpa;
	 private List<Application> application;
	public Student(String name, String email, long mobile, int id, double cgpa, List<Application> application) {
		super(name, email, mobile);
		this.id = id;
		this.cgpa = cgpa;
		this.application = application;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	public List<Application> getApplication() {
		return application;
	}
	public void setApplication(List<Application> application) {
		this.application = application;
	}
	 
	 
 }
