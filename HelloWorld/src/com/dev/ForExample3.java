package com.dev;

import java.util.Scanner;

public class ForExample3 {
	public static void main(String[] args) {
		// 입력받는 두수를 num1, num2 두 수 사이에 있는 값을 더하기
//		Scanner scn = new Scanner(System.in);
//		int num1, num2, sum = 0;
//		
//		System.out.println("첫번째 숫자를 입력하세요..");
//		num1 = scn.nextInt(); //입력했던 값을 불러오는 기능
//		System.out.println("두번째 숫자를 입력하세요..");
//		num2 = scn.nextInt(); //입력했던 값을 불러오는 기능
//		
//		int startCnt = 10;
//		int lastCnt = 20;
//		
//		for (int i = num1; num1 <= num2; i++) {
//			sum += i;
//		
//			
//			System.out.println(num1 + "부터" + num2 + "까지의 합" + sum);
//			
			int num1, num2;
			Scanner scn = new Scanner(System.in);
			System.out.println("첫번째 값 입력");
			num1 = scn.nextInt();
			System.out.println("두번째 값 입력");
			num2 = scn.nextInt();
			int sum = 0;
			for (int i = num1; i <= num2; i++) {
				sum += i;
				//if(true) //블록 잘보기, 한 블럭당 하나만 정의
			}
			System.out.println(num1 + "부터 " + num2 + "까지의 합은 " + sum);
			{
				int num3 = 0;
			}
			{
			    int num3 = 10;
			}
			
		

	}
}