package com.dev;
//문제5) Book클래스를 선언(필드:책제목, 저자, 출판사, 금액) 
//생성자(책제목, 저자, 출판사, 금액)를 선언 후 Scanner클래스를 사용하여 사용자의 입력을 통하여 인스턴스를 생성하고 
//입력한 내용을 책제목, 저자, 출판사, 금액 정보를 화면에 출력하는 기능 구현.
public class Book {
    private String BookTitle;
    private String BookMaker;
    private String BookCompany;
    private int price;
	public String getBookTitle() {
		return BookTitle;
	}
	public void setBookTitle(String bookTitle) {
		BookTitle = bookTitle;
	}
	public String getBookMaker() {
		return BookMaker;
	}
	public void setBookMaker(String bookMaker) {
		BookMaker = bookMaker;
	}
	public String getBookCompany() {
		return BookCompany;
	}
	public void setBookCompany(String bookCompany) {
		BookCompany = bookCompany;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}




}
