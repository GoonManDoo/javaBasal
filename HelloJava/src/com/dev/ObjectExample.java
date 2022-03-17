package com.dev;
import java.util.Scanner;

import com.edu.Student;

public class ObjectExample {
   public static void main(String[] args) {
	   Scanner scn = new Scanner(System.in);
	   
	   
	Student s1 = new Student(100, "이가영"); //studNo = 100을 지정하면서 
	System.out.println(s1.getStudNo());//퍼블릭은 다른 패키지에서 불러오기 가능, 프라이빗은 안됨
	System.out.println(s1.getStudName());
	s1.setKorScore(100);
	s1.setEngScore(60);
	s1.setMathScore(80);
	Student s2 = new Student(101, "군만두", 80, 82, 85);
	System.out.printf(s2.getStudName() + "의 평균: %.2f", s2.getAvgScore());
	
	Student s3 = new Student(102, "김치만두", 70, 80, 90);
	Student s4 = new Student(103, "고기만두", 77, 82, 83);
	
	Student[] students = {s1, s2, s3, s4};
	//////////////////////////////////////////
	while(true) {
//	students[0].getAvgScore();
//	students[1].getStudName(); //밑에 for문이랑 동일
	
	System.out.println("\n조회하려는 학생의 이름:(ex:군만두) ");
	String searchName = scn.next();
	if(searchName.equals("종료")) {
		break;
	}
	for(int i=0; i<students.length;i++) {
		if(students[i].getStudName().equals(searchName))
		System.out.println(students[i].getStudInfo());
	}
	
	
	}
//	Scanner scn = new Scanner(System.in);
//	scn.nextInt(); //<<메소드
    System.out.println("end of porgram");
   }
//////////////////////////////////////////////////
}
