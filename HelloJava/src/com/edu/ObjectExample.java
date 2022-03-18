package com.edu;
//객체지향 프로그램 언어
//절차프로그램(데이터, 함수) -> 객체(데이터, 기능(함수),)
//Object(객체) -> class(도면, 틀) -> 인스턴스생성(초기화).
//학생(객체:Object) > Class Student > instance(new Student())

public class ObjectExample {
   public static void main(String[] args) {
	 int num1 = 10;
	 double num2 = 12.34;
	 double num3 = 20; //내부적으로 자동 형변환(Promotion)
	 int num4 = (int) 23.4; //강제로 형변환(Casting)
	 
	 String str1 = "Hello";// heap(인스턴스)생성, new String();
	 Car car1 = new Car(); //car에 담기 위한 초기화(인스턴스 생성)!
     car1.setModel("Sonata");
     car1.setPrice(1000);
     
     Student s1 = new Student(); //초기화 꼭 하기 //초기화시점에 값을 지정
     s1.setStudNo(100);
     s1.setStudName("군만두");
     s1.setKorScore(90);
     s1.setEngScore(80);
     s1.setMathScore(85);
     s1.setKorScore(90);
    
     
     System.out.println("영어점수 초기값 " + s1.getEngScore());
     System.out.println("이름의 초기값 " + s1.getStudName());
     System.out.println(s1.getStudName() + "의 합계: " + s1.getSumScore());
     System.out.println(s1.getStudName() + "의 평균: " + s1.getAvgScore());
     
   
   }
}
