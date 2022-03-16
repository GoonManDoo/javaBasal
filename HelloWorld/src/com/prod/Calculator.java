package com.prod;

//클래스를 정의하는 부분.
public class Calculator {

	double PI = 3.14;
	// 매개변수, 매개변수
//	int add(int n1, int n2) {
//		return n1 + n2; //정수 n1, n2를 받아서 더하고 그 값을 반환함

	// 반환:int, 매소드 이름은:minus, v1, v2 : v1 - v2
   int minus(int v1, int v2) {
	return v1 - v2;
   }
//사각형의 넓이 계산
   double getRectArea(double x, double y){
	   return x * y;
   }
   //원의 넓이 계산
   double getCircleArea(double radius) {
	   return PI * radius * radius;
	   
   
	  

}
}
