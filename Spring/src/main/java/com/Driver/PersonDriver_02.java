package com.Driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.Person_02;

public class PersonDriver_02 {
 public static void main(String[] args) {
   @SuppressWarnings("resource")
ApplicationContext context =	new ClassPathXmlApplicationContext("config_01.xml");
    Person_02 per = (Person_02) context.getBean("construct");
    per.getDetails();
}
}
