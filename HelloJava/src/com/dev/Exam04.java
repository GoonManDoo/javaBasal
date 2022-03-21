package com.dev;

public class Exam04 {
	public static void main(String[] args) {
		int[] intAry = new int[5];

		for (int i = 0; i < intAry.length; i++) {
			intAry[i] = (int) (Math.random() * 6) + 1;
		}
		int temp = intAry[0];
		for (int i = 0; i < intAry.length; i++) {
			if (intAry[i] > temp) {
				temp = intAry[i];

				System.out.println(temp);
			}
		}
	}}

//	int[] ary = new int[3];
//	Scanner scn = new Scanner(
//			System.in);System.out.println("첫번째 값 입력");
//ary[0]=scn.nextInt();System.out.println("두번째 값 입력");
//ary[1]=scn.nextInt();System.out.println("두번째 값 입력");
//ary[2]=scn.nextInt();
//   if(ary[0]>=ary[1]&&ary[0]>=ary[2])
//	{
//		System.out.println(ary[0]);
//	}else if(ary[1]>=ary[0]&&ary[1]>=ary[2])
//	{
//		System.out.println(ary[1]);
//	}else if(ary[2]>=ary[0]&&ary[2]>=ary[1])
//	{
//			System.out.println(ary[2]);
//}
