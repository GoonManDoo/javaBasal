package com.dev;

public class ForExample5 {
	public static void main(String[] args) {

		int num1 = 48;
		for (int i = 1; i <= num1; i++) {
			if (num1 % i == 0) {
				System.out.println("약수는: " + i);
			
			}

		}
	}
}