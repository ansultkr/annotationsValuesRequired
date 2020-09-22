package com.ansul.thakur;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	private String name;
	private String interestedCourse;
	private String hobby;
	@Value("Ishan")
	public void setName(String name) {
		this.name = name;
	}
	@Value("machine Learning")
	public void setInterestedCourse(String interestedCourse) {
		this.interestedCourse = interestedCourse;
	}
	@Value("Tennis")
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	public void displayStudentInfo() {
		System.out.println("Student Name: "+name);
		System.out.println("Student Course: "+interestedCourse);
		System.out.println("Student Hobby: "+hobby);
	}
	

}
