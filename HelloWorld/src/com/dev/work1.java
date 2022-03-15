package com.dev;

import java.util.Scanner;

public class work1 {
  public static void main(String[] args) {
	  Scanner scn = new Scanner(System.in);
	  int num1, num2;
	  System.out.println("숫자를 입력하세요.");
	  num1 = scn.nextInt();
	  System.out.println("숫자를 입력하세요.");
	  num2 = scn.nextInt();
	  
	  if(num1 > num2) {
		  System.out.println("두 수의 차 " + (num1 - num2));
	  } else {
		  System.out.println("두 수의 차 " + (num2 - num1));
		  
		  scn.close();
	      
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	
}
}
