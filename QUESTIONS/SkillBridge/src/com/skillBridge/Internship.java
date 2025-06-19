package com.skillBridge;

import java.util.ArrayList;
import java.util.List;

public class Internship {
 private int id;
 private String title;
 private InternshipCatagory catagory;
 private int duration;
 private List<Student> applicant;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public InternshipCatagory getCatagory() {
	return catagory;
}
public void setCatagory(InternshipCatagory catagory) {
	this.catagory = catagory;
}
public int getDuration() {
	return duration;
}
public void setDuration(int duration) {
	this.duration = duration;
}
public List<Student> getApplicant() {
	return applicant;
}
public void setApplicant(List<Student> applicant) {
	this.applicant = applicant;
}
public Internship(int id, String title, InternshipCatagory catagory, int duration) {
	super();
	this.id = id;
	this.title = title;
	this.catagory = catagory;
	this.duration = duration;
	this.applicant = new ArrayList<>();
}


@Override
public String toString() {
	return "Internship [id=" + id + ", title=" + title + ", catagory=" + catagory + ", duration=" + duration
			+ ", applicant=" + applicant.size() + "]";
}
 
 

 
}
