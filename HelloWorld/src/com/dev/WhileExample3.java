package com.dev;

import java.util.Scanner;

public class WhileExample3 {
    public static void main(String[] args) {
		//입력을 계속 입력할 수 있도록..
    	//-1 값을 입력하면 더이상 입력하지 않겠다
    	//sum 값에 입력...
        //스캐너 선언, sum(0으로 초기화) 선언.
    	//while 조건 true
    	//숫자를 입력하세요.
    	//inputVal 변수에 담기
    	//입력 값이 -1이면 반복문 종료
    	//-1이 아니면 sum에 누적시키기
    	//합계는 sum 입니다 출력
    	
    	Scanner scn = new Scanner(System.in);
    	int inputVal;
    	int sum = 0;
    	while(true) {
    		System.out.println("숫자를 입력하시오");
    		inputVal = scn.nextInt();
    		
    		if(inputVal == -1) {
    			System.out.println("종료합니다.");
    			break;
    			
    			
    		} else {
    		  sum = inputVal + sum;
    			System.out.println("현재 값은 " + sum + " 입니다.");
    		}
    	   
    	    
    	
    	
    	
    	}
	  
    
    
    
    
    
    
    
    
    
    }
}
