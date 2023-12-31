package com.test;

public class CollegeStudent extends Student {
	private String profName; // 담당교수.
	private String major; // 전공정보.
	
	
	public CollegeStudent(int studNo, String studName, String profName, String major) {
		super(studNo, studName);
		this.profName = profName;
		this.major = major;
	}


	public String getProfName() {
		return profName;
	}


	public void setProfName(String profName) {
		this.profName = profName;
	}


	public String getMajor() {
		return major;
	}


	public void setMajor(String major) {
		this.major = major;
	}


	@Override
	public String toString() {
		return "[학생번호= " + super.getStudNo() + "], [학생이름= " + super.getStudName() +"], 대학생 정보 [담당교수=" + profName + "], [전공=" + major + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
