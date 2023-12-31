package com.test;

public class Student {
	private String studNo; // 학생번호.
	private String studName; // 학생이름.

	public Student(int studNo, String studName) {
		
	}

	public Student(String studNo, String studName) {
		this.studNo = studNo;
		this.studName = studName;
	}

	public String getStudNo() {
		return studNo;
	}

	public void setStudNo(String studNo) {
		this.studNo = studNo;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	@Override
	public String toString() {
		return "학생정보 [학생번호=" + studNo + "], [학생이름=" + studName + "]";
	}

}
