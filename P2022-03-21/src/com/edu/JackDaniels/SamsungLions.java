package com.edu.JackDaniels;

import javax.swing.Spring;

public class SamsungLions {
	

	// Getter, Setter 생성

	

	private int Bno;
	private String Btitle;
	private String Content;
	private String Writer;
	private String Date;
	private int writeNum;
	private String Dname;
	private String Dd;
	
	

	public String getDname() {
		return Dname;
	}



	public void setDname(String dname) {
		Dname = dname;
	}



	public String getDd() {
		return Dd;
	}



	public void setDd(String dd) {
		Dd = dd;
	}



	public SamsungLions() {
		
	}

	
	
	public int getWriteNum() {
		return writeNum;
	}



	public void setWriteNum(int writeNum) {
		this.writeNum = writeNum;
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

	public SamsungLions(String dname, String dd) {
		super();
		Dname = dname;
		Dd = dd;
	}



	@Override
	public String toString() {

		return "SamsungLions App [게시글 번호=" + Bno + "], [제목=" + Btitle + "], [내용=" + Content + "], [작성자=" + Writer
				+ "], [작성시간= " + Date + "댓글 내용= " + this.Dd + "작성자= " + this.Dname + "]";


		

	}

	
	
	
	
	

	
	
	
	



	
	
	
}