package com.Driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.Person_03;

public class PersonDriver_03 {
	 public static void main(String[] args) {
			@SuppressWarnings("resource")
			ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//			getBean("value")==<bean id="value">
			Person_03 per =(Person_03) context.getBean("person");
		   per.start();
}
}
