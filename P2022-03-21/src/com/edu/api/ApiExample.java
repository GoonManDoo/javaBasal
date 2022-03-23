package com.edu.api;

import java.util.Scanner;

public class ApiExample {
   public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	
	IDCheck idcheck = new IDCheck();
	   String result = idcheck.getGender("9503042134567");
	   System.out.println(result);
	   
	   result = idcheck.getGender("950304-1134567");
	   System.out.println(result);
	   
	   System.out.println("end of prog");
}
}


//	Scanner scn = new Scanner(System.in);
//
//System.out.println("주민번호를 입력하세요.");
//IDCheck idcheck = new IDCheck();
//String gender = scn.nextLine();
//idcheck.getGender(gender);
//scn.close();