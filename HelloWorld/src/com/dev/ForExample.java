package com.dev;

public class ForExample {
   public static void main(String[] args) {
	   
		   // 1 ~ 10까지 더하면?
		   int sum = 0;
		   for (int i = 1; i <= 5; i++) { //i++ 1, 1 += 1;, i = i + 1; 1씩 증가시키겠다, 반복문
		   System.out.println(i);
		   sum = sum + 1; // 0, 1 => 1, 3, 6, 10,
		   
	   }
	   System.out.println("합계: " + sum);
	   
	  // System.out.println("1");
   }	
}

