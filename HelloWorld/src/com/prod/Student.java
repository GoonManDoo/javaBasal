package com.prod;

public class Student {
    //22-123456
	//필드. (field)
   String studentNo;
   String studentName;
   int korScore;
   int engScore;
  
   //method : 기능, 함수
   void study(String 과목) {
	   System.out.println(과목 + "공부를 합니다.");
   }
   void eat(String food) {
	   System.out.println(food + "을 먹습니다.");
   
	   }
   int getkorScore() {
	   return korScore; //국어점수를 반영하는 
   }
   int getEngScore() {
	   return engScore;
   }

}
