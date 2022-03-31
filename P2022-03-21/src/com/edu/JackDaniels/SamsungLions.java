package com.edu.JackDaniels;

import javax.swing.Spring;

public class SamsungLions {
	// 학생번호(1,2,3), 이름(홍길동), 영어(80), 국어(70).

	// 생성자 : 기본생성자, 매개값이 4개 생성자.

	// Getter, Setter 생성
	private int Bno = 300;
	private String Btitle;
	private String Content;
	private String Writer;
	private String Date;

	public SamsungLions() {
		
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

	public SamsungLions(int bno, String btitle, String content, String writer, String date) {
		super();
		Bno = bno;
		Btitle = btitle;
		Content = content;
		Writer = writer;
		Date = date;
	}

	@Override
	public String toString() {
		return "SamsungLions [Bno=" + Bno + ", Btitle=" + Btitle + ", Content=" + Content + ", Writer=" + Writer
				+ ", Date=" + Date + "]";
	}
	
	
	
	



	
	
	
}