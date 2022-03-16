package com.prod;

public class StudentExample {
    public static void main(String[] args) {
		Student s1 = new Student();
		s1.studentName = "홍길동";
		s1.korScore = 80;
		s1.engScore = 85;
		
		s1.study("수학"); //study <->student void
		s1.study("국어");
		s1.study("도덕");
		s1.study("음악");
		
		s1.eat("급식");
		s1.eat("간식");
		s1.eat("초콜렛");
	
        int v1 = s1.getkorScore();
        int v2 = s1.getEngScore();
        System.out.println("홍길동의 국어점수는 " + v1 + "점입니다.");
        System.out.println("홍길동의 영어점수는 " + v2 + "점입니다.");
        
        
        
    }
}
