package com.edu.lamdaconsumerExample;

import java.util.function.*;
//Supplier 인터페이스 : 매개값이 없음 -> 반환값은 있음
public class SupplierExample {
   public static void main(String[] args) {
	 
	   IntSupplier intSup = () -> (int) (Math.random() * 10);

		
		int result = intSup.getAsInt();
			System.out.println("결과값은: " + result);
		}
		   
	   
}

