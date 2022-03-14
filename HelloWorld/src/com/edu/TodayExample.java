package com.edu;
// 이름을 입력받도록...(String)
// 연락처 입력...(String) > scn.nextLine(); 문자열
// 나이 입력...(int) > scn.nextInt(); <정수형 값으로 받아들이겠습니다.
// 키 입력...(double) > scn.nextDouble(); < 정확한 값

import java.util.Scanner;

// 이름은 : 김영민
// 연락처 : 010-5701-8439
// 나이 : 24
// 키 : 173.8
//
//
public class TodayExample {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		String name, tel;
		int age;
		double tall, weight;
		double bmi;
		System.out.println("이름: ");
		name = scn.nextLine();
		System.out.println("전화번호: ");
		tel = scn.nextLine();
		System.out.println("나이: ");
		age = scn.nextInt();
		System.out.println("키: ");
		tall = scn.nextDouble();
		System.out.println("몸무게: ");
		weight = scn.nextDouble();
		System.out.println("적정몸무게: ");
		bmi = (tall - 100) * 0.9 ;
		
		
		
		
		System.out.println("전화번호: " + tel);
		System.out.println("나이: " + age);
		System.out.println("키: " + tall);
        System.out.println("적정몸무게: " + bmi);
        System.out.println("몸무게" + weight);
		
		
		
		double realWeight = 69.3; // 30
		
		if(weight+5>realWeight && weight-5<realWeight) {
	        System.out.println("적정 몸무게입니다. ");
	}  else {
	        System.out.println("돼지입니다.");
	        
	        	
	  }
}
}
