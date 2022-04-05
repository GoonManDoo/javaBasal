package com.edu.JackDaniels;

public class Reply {

	private int rno; //댓글번호
	private String replytext; //댓글 내용
	private String writer;//댓글 작성자 이름
	
	public Reply() {
		
	}
	public Reply(String replytext, String writer) {
		super();
		this.replytext = replytext;
		this.writer = writer;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
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
		return "댓글목록 [번호=" + rno +  "], [댓글 내용=" + replytext + "], [댓글 작성자=" + writer + "]";
	}
     


}
