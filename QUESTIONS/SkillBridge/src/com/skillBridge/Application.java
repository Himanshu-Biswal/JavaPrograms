package com.skillBridge;

public class Application {
 private Student student;
 private Internship internship;
 private String status;
public Student getStudent() {
	return student;
}
public void setStudent(Student student) {
	this.student = student;
}
public Internship getInternship() {
	return internship;
}
public void setInternship(Internship internship) {
	this.internship = internship;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public Application(Student student, Internship internship, String status) {
	super();
	this.student = student;
	this.internship = internship;
	this.status = status;
}
 
 
}
