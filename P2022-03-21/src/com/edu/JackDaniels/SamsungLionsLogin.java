package com.edu.JackDaniels;

public class SamsungLionsLogin {

	private String id;
	private String pw;
	public SamsungLionsLogin(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	@Override
	public String toString() {
		return "SamsungLionsLogin [아이디=" + id + "], [비밀번호=" + pw + "]";
	}
	
	
	
	
}
