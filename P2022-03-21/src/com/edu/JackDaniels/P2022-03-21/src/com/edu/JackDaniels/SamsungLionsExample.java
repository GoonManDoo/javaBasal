package com.edu.JackDaniels;

import java.util.ArrayList;
import java.util.List;

public class SamsungLionsExample {
	 public static void main(String[] args) {
	      List<SamsungLions> list = new ArrayList<SamsungLions>();

	      SamsungLions s1 = new SamsungLions(101, "홍길동", 70, 73);
	      SamsungLions s2 = new SamsungLions(102, "김형민", 80, 85);
	      SamsungLions s3 = new SamsungLions(103, "김영민", 84, 88);
	      
	      list.add(s1);
	      list.add(s2);
	      list.add(s3);
	      
	      SamsungLions result = list.get(0); // 첫번째 학생정보 저장.
	      System.out.println("첫번째 학생: " + result.toString());
	      
	      list.set(0, new SamsungLions (201, "서현일", 90, 92)); // 첫번째 인스턴스 변경.
	      result = list.get(0);
	      
	      list.get(0).setKorScore(100); // 첫번재 인스턴스의 값을 변경.
	      list.get(0).setEngScore(100);
	      list.remove(0); // 삭제처리.
	      System.out.println("두번째 학생: " + result.toString());
	      
	   }
	}
