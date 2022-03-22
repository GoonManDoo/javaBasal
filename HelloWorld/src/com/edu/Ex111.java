package com.edu;

import java.util.Scanner;

public class Ex111 {
   public static void main(String[] args) {
  Scanner scn = new Scanner(System.in);
	 
 int s1 = 100;
 int sum = 0;
 double avg = sum / 5;
 int[] scores = new int[5];
 
 scores[0] = 80;
 scores[1] = 70;
 scores[2] = 90;
 scores[3] = 75;
 scores[4] = 93;
 
 sum = 0;
 for (int i = 0; i < 5; i++) {
	 System.out.println(scores[i]);
	 sum += scores[i];
 }
 avg = sum / (double) 5;
 System.out.println("평균은" + avg + "입니다.");
			   
   
	   
	   
}
}