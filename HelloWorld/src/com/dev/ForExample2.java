package com.dev;

public class ForExample2 {
public static void main(String[] args) {
	//for 반복문

	int sum = 0; //lastCnt = 1; 1번 반복

	int startCnt = 1;
	int lastCnt = 20;
	for(int i = startCnt; i <= lastCnt; i ++) {
		if(i % 2 == 0)
		System.out.println(i);
		sum += i;
	
    System.out.println("짝수의 합: " + sum);
	
	
	
	
	
	
	
	
}
}
}