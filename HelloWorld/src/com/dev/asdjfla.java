package com.dev;

import java.util.Scanner;

public class asdjfla {
//num1, num2, num3의 값을 입력받도록 한 후  CAB, CBA
//작은 수부터 큰 수로 정렬하는 프로그램
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num1, num2, num3;
		System.out.println("숫자를 입력하세요.");
		num1 = scn.nextInt();
		System.out.println("숫자를 입력하세요.");
		num2 = scn.nextInt();
		System.out.println("숫자를 입력하세요.");
		num3 = scn.nextInt();
		
		if(num1 > num2 && num2 > num3); {
		System.out.println(num3 + ", " + num2 + ", " + num1); 
		}
		
		if(num1 > num3 && num3 > num2); {
			System.out.println(num2 + ", " + num1 + ", " + num3); 
			}
		
		if(num2 > num1 && num1 > num3); {
			System.out.println(num3 + ", " + num1 + ", " + num2); 
			}
		
		if(num2 > num3 && num3 > num1); {
			System.out.println(num2 + ", " + num3 + ", " + num1); 
			}
		
		if(num3 > num1 && num1 > num2); {
			System.out.println(num2 + ", " + num1 + ", " + num3); 
			}
		
		if(num3 > num2 && num2 > num1); {
			System.out.println(num1 + ", " + num3 + ", " + num2); 
		
	
		}
	   scn.close();
	
	}
	
}
