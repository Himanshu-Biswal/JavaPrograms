package com.demo;
  

// Dependency Injection Using setter Injection
public class Person_01 {
	private String name;
	private int age;
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
  public void getDetails() {
	  System.out.println("Person Name: "+name+" Age: "+age);
  }
}
