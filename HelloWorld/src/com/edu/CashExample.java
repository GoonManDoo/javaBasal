package com.edu;

import java.util.Scanner;

public class CashExample {
 public static void main(String[] args) {
	 Scanner scn = new Scanner(System.in);
	 // 2개의 값을 입력.
	 int price, cash;
	 
	 // 가격을 입력하세요..
	 System.out.println("가격을 입력하세요.");
	 price = scn.nextInt(); // 5500은 부가세 10% 포함된 금액.
	
	 // 손님이 낸 금액 10000
	 System.out.println("손님이 낸 금액.");
	 cash = scn.nextInt();
	
	 // 하나는 상품의 부가세, 하나는 거스름돈
	 // 부가세: 500원
    System.out.println("부가세" + (price * 1 / 11));
	 // 거스름돈: 4500
	 System.out.println("거스름돈: " + (cash - price));
	
	 
	 
	 
	 
   }
}
