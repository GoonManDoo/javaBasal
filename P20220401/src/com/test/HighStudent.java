package com.test;

public class HighStudent extends Student {
	private String teacherName; // 담임선생님.
	private String groupName; // 반이름.
	
	
	public HighStudent(int studNo, String studName, String teacherName, String groupName) {
		super(studNo, studName);
		this.teacherName = teacherName;
		this.groupName = groupName;
	}


	public String getTeacherName() {
		return teacherName;
	}


	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}


	public String getGroupName() {
		return groupName;
	}


	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}


	@Override
	public String toString() {
		String info = super.toString();
		info += "정보 [담임선생님=" + teacherName + "], [반이름=" + groupName + "]";
	 return info;
	}
	


	
	


}
