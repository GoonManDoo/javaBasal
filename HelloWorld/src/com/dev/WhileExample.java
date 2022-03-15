package com.dev;

import java.util.Scanner;

public class WhileExample {
    public static void main(String[] args) {
//		// for 5번 반복할 때
//    	for(int i = 1; i <=5; i++) { //꼭 외우기!
//    		System.out.println("i의 값 => " + i);
//    	
//    	}
//    	System.out.println();
//       //while
//       int i = 1; //초기화
//       while(i <= 5) { //조건식
//           System.out.println("i의 값 => " + i);
//           i++; //증강식
//           
//       }
//      //while
//       int num = 0;
//       while(true) { 
//    	   System.out.println("num의 값 => " + num);
//    	   num++;
//    	   if(num > 5) {
//    		   break; //5를 넘어가면 반복문을 빠져나옴
//    	   }
       //while
//    	while(true) {
//    		int rand = (int) (Math.random() * 10); //1 ~ 10 임의의 값
//    		System.out.println("임의의 생성된 값: " + rand);
//    		if(rand == 8) {
//    			break;
//    		}
//    	}
    	   // 수를 맞출때까지 계속 반복..
    	Scanner scn = new Scanner(System.in); //while 반복문
    	int randomVal, userVal;
    	while(true) {
    		randomVal = (int) (Math.random() * 5) + 1;
    		System.out.println("임의의 값을 입력(1 ~ 5)");
    		userVal = scn.nextInt();
    		
    		if(randomVal == userVal) {
    			System.out.println("생성된 임의의 값과 같습니다.");
    			break;
    		}
    		
    		
    	}
       
       
       System.out.println("end of prog");
    }
    }
//    }
