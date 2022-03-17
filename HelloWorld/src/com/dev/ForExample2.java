package com.dev;

public class ForExample2 {
public static void main(String[] args) {
	//for 반복문
//	for(int i = 1; i <=3; i++)
//		System.out.println(i);
//	
//	for(int i = 4; i <=6; i++)
//		System.out.println(i);
	
//	for(int i = 5; i <=1; i--)
//		System.out.println(i);
	
//	for(int i = 0; i<=10; i += 2)
//		System.out.println(i);
	
	int sum = 0; //lastCnt = 1; 1번 반복
//	for(int i = 1; i <= 1; i ++) {
//		if(i % 2 == 0)
//		System.out.println(i);
//		sum += i;
	//int sum = 0; //lastCnt = 1; 1번 반복
	int startCnt = 1;
	int lastCnt = 20;
	for(int i = startCnt; i <= lastCnt; i ++) {
		if(i % 2 == 0)
		System.out.println(i);
		sum += i;
	
    System.out.println("짝수의 합: " + sum);
	
	
	
	//	System.out.println(1);
    //	System.out.println(2);
    //	System.out.println(3);
	
	
	
	
}
}
}