package com.edu.lamdaconsumerExample;

import java.util.function.IntBinaryOperator;

// Operator : 연산처리 결과.
public class OperatorExample {
	public static void main(String[] args) {

		IntBinaryOperator intBin = (left, right) -> left + right;
		intBin.applyAsInt(10, 20);

		intBin = (num1, num2) -> num1 > num2 ? num1 : num2; 
		// 2개의 매개값을 받아서 크면 num1에 작으면 num2에
		
		int result = maxOrMin(intBin);
		System.out.println(result);

	}

	public static int maxOrMin(IntBinaryOperator intBin) {
		int[] intAry = { 85, 47, 92 }; // 제일 큰 값을 리턴
		int result = intAry[0];
		for (int num : intAry) {
			result = intBin.applyAsInt(result, num);
		}
		return result;

	}

}
