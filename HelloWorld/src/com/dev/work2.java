package com.dev;

import java.util.Scanner;

public class work2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num1, num2, num3;
		System.out.println("숫자를 입력하세요.");
		num1 = scn.nextInt();
		System.out.println("숫자를 입력하세요.");
		num2 = scn.nextInt();
		System.out.println("숫자를 입력하세요.");
		num3 = scn.nextInt();
		
		if(num3 > num2 && num2 > num1) {
			System.out.println(num1 + ", " + num2 + ", " + num3);
		}
		if(num3 > num1 && num1 > num2) {
			System.out.println(num2 + ", " + num1 + ", " + num3);
		}
		if(num2 > num1 && num1 > num3) {
			System.out.println(num3 + ", " + num1 + ", " + num2);
		}
		if(num2 > num3 && num3 > num1) {
			System.out.println(num1 + ", " + num3 + ", " + num2);
		}
		if(num1 > num2 && num2 > num3) {
			System.out.println(num3 + ", " + num2 + ", " + num1);
		}
		if(num1 > num3 && num3 > num2) {
			System.out.println(num2 + ", " + num3 + ", " + num1);
		}
		scn.close();
			
			
		
			
		}
		
}
