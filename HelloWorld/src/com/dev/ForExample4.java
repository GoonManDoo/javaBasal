package com.dev;

public class ForExample4 {
	public static void main(String[] args) {
		// 1 ~ 10까지 수 중에서 짝수의 값 > evenSum, 홀수의 값 > oddSum
		// 홀수의 합: ??, 작수의 합: ?? 입니다.

		int evenSum = 0;
		int oddSum = 0;

		for (int i = 1; i <= 10; i++) { // 증강식 중요***
			if (i % 2 == 1) {
				oddSum += i; // oddSum = oddSum + i;
			} else {
				evenSum += i;
			} // evenSum = evenSum + i;
			

		} 
		System.out.println("짝수의 합 " + evenSum + ", 홀수의 합 " + oddSum);
	}
}

