package com.prod;

import java.util.Scanner;
 
public class A11111111 {
	public static void main(String[] args) {
	
	Scanner scn = new Scanner(System.in);
	System.out.println("책제목을 입력하세요.");
	String bookName = scn.next();
	System.out.println("저자를 입력하세요.");
	String Writer = scn.next();
	System.out.println("출판사를 입력하세요.");
	String Publisher = scn.next();
	System.out.println("금액을 입력하세요.");
	int Price = scn.nextInt();
	System.out.println("책 제목은 " + bookName + "이고 " + "저자는 " + Writer + "입니다." 
	+ " 출판사는 " + Publisher + "이고" + " 가격은 " + Price + "원 입니다.");

}
}