package com.ansul.thakur;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student s = context.getBean("student",Student.class);
		s.displayStudentInfo();
		
	}

}
