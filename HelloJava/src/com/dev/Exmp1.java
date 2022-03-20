package com.dev;

import java.util.Scanner;

public class Exmp1 {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	
	Book user = new Book();
	System.out.println("책 제목을 입력하시오.");
	String num1 = scn.next();
	user.setBookTitle(num1);
	
	
	System.out.println("저자를 입력하시오.");
	String num2 = scn.next();
	user.setBookMaker(num2);
	
	
	System.out.println("출판사");
	String num3 = scn.next();
	user.setBookCompany(num3);
	
	System.out.println("금액");
	int num4 = scn.nextInt();
	user.setPrice(num4);
	
	
	
	System.out.println("책제목" + num1 
			          + "저자"  + num2
			          + "출판사" + num3
			          + "금액" + num4 + "원 입니다.");
	
	
}
}
