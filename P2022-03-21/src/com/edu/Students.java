package com.edu;

public class Students extends Person { 
     //extends Person, person 클래스를 상속 받겠다.
	//person의 정보를 받고 students의 정보도 따로 하겠다.
	//학교, 학년 : 이름, 나이, 키, 몸무게
	private String school;
	private int grade;
	
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}

}
