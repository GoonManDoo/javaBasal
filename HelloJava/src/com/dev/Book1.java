package com.dev;

import java.util.Scanner;

//문제5) Book클래스를 선언(필드:책제목, 저자, 출판사, 금액) 
//생성자(책제목, 저자, 출판사, 금액)를 선언 후 Scanner클래스를 사용하여 사용자의 입력을 통하여 인스턴스를 생성하고 
//입력한 내용을 책제목, 저자, 출판사, 금액 정보를 화면에 출력하는 기능 구현.
public class Book1 {
   public static void main(String[] args) {
	 Scanner scn = new Scanner(System.in);
	 
	 Book user = new Book();
	 System.out.println("책 제목 입력해라");
	 String num1 = scn.next();
	 user.setBookTitle(num1);
	 
	 System.out.println("책 저자 입력해라");
	 String num2 = scn.next();
	 user.setBookMaker(num2);
	 
	 System.out.println("출판사 입력해라");
	 String num3 = scn.next();
	 user.setBookCompany(num3);
	 
	 System.out.println("가격 입력해라");
	 int num4 = scn.nextInt();
	 user.setPrice(num4);
	 
	 System.out.println("책제목 " + num1 " 이고,"
	          + "저자 "  + num2
	          + "출판사 " + num3
	          + "금액 " + num4 + "원 입니다.");
}
}
