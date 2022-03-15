package com.edu;

import java.util.Scanner;

public class MathExample {
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	double num1, num2;
	System.out.println("첫번째 숫자를 입력하세요..");
	num1 = scn.nextInt(); //입력했던 값을 불러오는 기능
	System.out.println("두번째 숫자를 입력하세요..");
	num2 = scn.nextInt(); //입력했던 값을 불러오는 기능
	
	System.out.println("두수의 합 " + (num1 + num2));
	System.out.println("두수의 차 " + (num1 - num2));
	System.out.println("두수의 곱 " + (num1 * num2));
	System.out.println("두수의 나누기 " + (int)(num1 / num2));
	System.out.println("두수의 나머지 " + (num1 % num2));
	
	// var num3 = 10; 정수는 int, 소수는 더블
	
	scn.close();
	}
	

}
