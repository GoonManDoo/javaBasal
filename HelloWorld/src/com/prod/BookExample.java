package com.prod;

public class BookExample {
   public static void main(String[] args) {
	

	//책(책제목, 저자, 출판사, 가격)
	//book1 > 초기화: 혼공자, 신용권, 한빛미디어, 24000
	//book2 > 초기화: powerJava, 천인국, 인피니티, 35000\
	//book3 > 초기화: 재밌는 Java, 이호준, 인피니티, 2000
	
	Book book1 = new Book();
	book1.bookName = "혼공자";
	book1.name = "혼공자";
	book1.company = "인피니티";
	book1.price = 24000;
	
	Book book2 = new Book();
	book2.bookName = "PowerJava";
	book2.name = "천인국";
	book2.company = "인피니티";
	book2.price = 35000;
	
	Book book3 = new Book();
	book3.bookName = "재밌는 Java";
	book3.name = "이호준";
	book3.company = "인피니티";
	book3.price = 20000;
	
	Book[] books = {book1, book2, book3};
	
	for(int i=0; i < books.length; i++) {
		if(books[i].company == "인피니티" && books[i].name == "신용권")
			
		
	System.out.println("책제목: " + books[i].bookName);
	System.out.println("저자: " + books[i].name);
	System.out.println("출판사: " + books[i].company);
	System.out.println("가격: " + books[i].price);
	}
	}

}


	
	

