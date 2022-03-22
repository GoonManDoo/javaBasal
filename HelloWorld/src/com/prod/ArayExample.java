package com.prod;

public class ArayExample {
	public static void main(String[] args) {
//		long l1 = 123456543341234L; //L은 long를 나타냄, 붙여야됨, /byte
//		int i1 = 100; //담을 수 있는 메모리 크기 4byte
//		byte b1 = 127;//담을 수 있는 메모리 크기 1byte, max는 128, -128~-1/0~127
//		b1++;
//		b1++;
		
	int s1 = 100; // -32768 ~ -1 / 0~32767
		System.out.println(); 
		
		int sum = 0;

		
		double avg = sum / (double) 5; //double avg 평균
		
		int[] scores = new int[5]; //인덱스는 0부터 시작
		
		scores[0] = 80;
		scores[1] = 90;
		scores[2] = 85;
		scores[3] = 95;
		scores[4] = 88;
		

		
		//배열을 활용해서 sum > avg
		sum = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println(scores[i]); //scores[0]
			sum += scores[i];
		}
		avg = sum / (double) 5;	
		System.out.println("평균은 " + avg);
		
		
		

	}
}


