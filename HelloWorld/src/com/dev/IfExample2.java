package com.dev;

import java.util.Scanner;

public class IfExample2 {
    public static void main(String[] args) {
    	// 물건가격이 50000원 이상이면 배송비가 0
    	// 그외에는 배송비가 3000원
    	//결제할 금액이 얼마인지 보여주는 코드
    	Scanner scn = new Scanner(System.in);
    	int price, shippingFee = 3000;
    	System.out.println("물건의 가격을 입력하세요.");
    	price = scn.nextInt();
    	
    	if(price >= 50000) {
    	   price = price;
    	} else {
    	    price = price + shippingFee;
    	} 
    	price = (price >= 50000) ? price : price + shippingFee;
    	// 괄호 안에 있는 조건을 만족하면 괄호 안이 프라이스, 만족 못하면 오른쪽이 프라이스
    	System.out.println("결제할 금액은 " + price + "원 입니다.");
    	
    		
    	
    	
	
}
}
