package com.edu.JackDaniels;

import javax.swing.Spring;

public class SamsungLions {
	// 학생번호(1,2,3), 이름(홍길동), 영어(80), 국어(70).

	// 생성자 : 기본생성자, 매개값이 4개 생성자.

	// Getter, Setter 생성
	int Bno = 300;
	String Btitle = "김상수";
	String Content = "왕좌에오른푸른사자";
	String Writer = "왕좌에복귀한푸른사자";
	String Date = "2022-10-12";

	public SamsungLions() {
		
	}
	
	
	
	public SamsungLions(int bno, String btitle, String content, String writer, String date) {
		super();
		Bno = bno;
		Btitle = btitle;
		Content = content;
		Writer = writer;
		Date = date;
	}



	public SamsungLions(int stuNo, Object studentName2, Object object, Object object2) {
		// TODO Auto-generated constructor stub
	}

	public int getBno() {
		return Bno;
	}

	public void setBno(int bno) {
		Bno = bno;
	}

	public String getBtitle() {
		return Btitle;
	}

	public void setBtitle(String btitle) {
		Btitle = btitle;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	public String getWriter() {
		return Writer;
	}

	public void setWriter(String writer) {
		Writer = writer;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	
	
	
	
}