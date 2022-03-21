package com.edu;



public class ArraySort {
   public static void sorting (int[] ary) {
	   int loopCnt = ary.length - 1;//마지막값이 제일 처음위치로 이동하려면 배열크기-1;
	   for (int cnt = 0; cnt < loopCnt; cnt++) {
		   int temp = ary[0]; //첫번재 값으로 temp 값을 지정
		   for (int i = 0; i < loopCnt; i++) {
			   
		   if(ary[i] > ary[i + 1]) {
			   //34 25 => 25 34로 위치 변경
		   temp = ary[i];
		   ary[i] = ary[i + 1];
		   ary[i + 1] = temp; 
   }
		   }
	   }
	   }
	
	
	public static void main(String[] args) {
	//int[] intAry => {30, 25, 48, 12}; 오름차순으로 하기
	   int[] intAry = {34, 25, 48, 12};//제일 마지막값이 최소값이라고 가정
       int[] intAry2 = {32, 22, 44, 11};
       int[] intAry3 = {22, 56, 99, 14};
//	                   25, 34, 12, 48 
	   
       
       int loopCnt = intAry.length - 1;//마지막값이 제일 처음위치로 이동하려면 배열크기-1;
	   for (int cnt = 0; cnt < loopCnt; cnt++) {
		   int temp = intAry[0]; //첫번재 값으로 temp 값을 지정
		   for (int i = 0; i < loopCnt; i++) {
			   
		   if(intAry[i] > intAry[i + 1]) {
			   //34 25 => 25 34로 위치 변경
		   temp = intAry[i];
		   intAry[i] = intAry[i + 1];
		   intAry[i + 1] = temp;
		   
		   }
	   }
   
	   } //변경된 결과 출력
	   sorting(intAry);
	   for (int i = 0; i < intAry.length; i++) {
	   System.out.println(intAry[i] + " ");
	   {
   sorting(intAry2);
   for (int i = 0; i < intAry.length; i++) {
   }
   System.out.println();
   System.out.println("end of prog");
   }
}
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
//	   int temp;
//	   for (int i = 0; i < intAry.length; i++) {
//		   
//		   
//		   if(intAry[0] >= intAry[1] && intAry[1] >= intAry[2])
//		   { 
//		   } else if (intAry[1] >= intAry[0] && intAry[1] >= intAry[2]) }
//	        
//    } else if (intAry[2] >= intAry[0] && intAry[2] >= intAry[0]) {
//   
//   
//   
//   }
   


