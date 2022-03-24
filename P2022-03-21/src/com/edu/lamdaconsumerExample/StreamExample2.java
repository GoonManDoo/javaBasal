package com.edu.lamdaconsumerExample;

import java.util.ArrayList;
import java.util.List;

public class StreamExample2 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("김지찬", "남자", 70, 100));
		list.add(new Student("이유빈", "여자", 80, 120));
		list.add(new Student("김형민", "여자", 85, 95));
		list.add(new Student("김상수", "남자", 90, 99));

		// 남자, 여자 스코어+포인트 > 180이상인 학생들만 출력하기.
		
		
		
		list// 컬렉션으로 부터
				.stream()// 스트림생성.
				.filter(student -> student.point + student.score >= 180) // 80점 이상인 대상을 필터
				.sorted()
				.forEach(student -> System.out.println(student));// 필터링된 대상을 출력.
                 System.out.println("=======================================================");
//		list// 컬렉션으로 부터
		list//
		.stream()// 스트림생성.
		.filter(student -> student.point + student.score >= 80) // 80점 이상인 대상을 필터
		.filter(student -> student.gender.equals("여자"))
		.forEach(student -> System.out.println(student));// 필터링된 대상을 출력.
	}
}
