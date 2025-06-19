package com.demo;


// Dependency Injection Using Constructor Injection
public class Person_02 {
  String name;
  int age;
public Person_02(String name, int age) {
	super();
	this.name = name;
	this.age = age;
}
  public void getDetails() {
	  System.out.println("Name: "+name+"  Age: "+age);
  }
}
