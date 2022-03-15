package com.dev;

import java.util.Scanner;

public class IfExample3 {
   public static void main(String[] args) {
	   int ranVal = (int) (Math.random() * 3) + 1; //0 ~ 10
	   
	   System.out.println(ranVal);
	   Scanner scn = new Scanner(System.in);
	   System.out.println("값을 입력하세요(1 ~ 3)");
	   int ran1 = scn.nextInt();
	   
	   if (ranVal == ran1) {
		   System.out.println("정답입니다");
	   } else {
		   System.out.println("거짓입니다");
		   
	   }
	 
	   
	   
	    
	  
	  
	 
	  
	  
	  
	  
}
}
