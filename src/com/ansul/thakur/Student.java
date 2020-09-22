package com.ansul.thakur;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;


public class Student {
	@Value("${student.name}")
	private String name;
	@Value("${student.interestedCourse}")
	private String interestedCourse;
	@Value("${student.hobby}")
	private String hobby;
	
	
	public void displayStudentInfo() {
		System.out.println("Student Name: "+name);
		System.out.println("Student Course: "+interestedCourse);
		System.out.println("Student Hobby: "+hobby);
	}
	

}
