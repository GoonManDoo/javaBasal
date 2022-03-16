package com.prod;

public class User1 {
	private int userId;
	private String userRank;
	private String userTel;
	private int userPoint;

	

	public int getUserId() {
		return this.userId;
	}



	public String getUserRank() {
		return this.userRank;
	}



	public String getUserTel() {
		return this.userTel;
	}



	public int getUserPoint() {
		return this.userPoint;
	}



	public void setUserId(int userId) {
		this.userId = userId;
	}



	public void setUserRank(String userRank) {
		this.userRank = userRank;
	}



	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}



	public void setUserPoint(int userPoint) {
		this.userPoint = userPoint;
	}



	public String getEmpInfo() {
		String result = "사용자아이디는 " + this.userId + "이고, "
				+ "사용자등급은 " + this.userRank + "이고, " 
				+ "전화번호는 " + this.userTel + "이고, "
				+ "사용자포인트는 " + this.userPoint + " 점입니다.";
		return result;
	}
}


//User 클래스 (사용자아이디, 사용자등급(A,B,C), 사용자연락처, 사용자포인트
//- Getters, Setters, 사용자정보를 보여주는 메소드(getUserInfo())
//- 배열에 저장하도록 User[ ] users > 출력..사용자등급: A, 1000포인트 이상