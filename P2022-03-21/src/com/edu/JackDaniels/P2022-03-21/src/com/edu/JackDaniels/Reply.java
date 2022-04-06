package com.edu.JackDaniels;

public class Reply {

	private int rno; //댓글번호
	private int bno; //게시물 번호
	private String replytext; //댓글 내용
	private String writer;//댓글 작성자 이름
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getReplytext() {
		return replytext;
	}
	public void setReplytext(String replytext) {
		this.replytext = replytext;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	@Override
	public String toString() {
		return "SamsungLionsDTO [rno=" + rno + ", bno=" + bno + ", replytext=" + replytext + ", writer=" + writer + "]";
	}
     


}
