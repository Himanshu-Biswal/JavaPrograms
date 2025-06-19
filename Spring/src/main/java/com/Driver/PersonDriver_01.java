package com.Driver;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.Person_01;

public class PersonDriver_01 {
  public static void main(String[] args) {
	@SuppressWarnings("resource")
	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//	getBean("value")==<bean id="value">
	Person_01 per =(Person_01) context.getBean("Person");
  per.getDetails();
}
}
