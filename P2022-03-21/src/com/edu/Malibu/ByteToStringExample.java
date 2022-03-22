package com.edu.Malibu;

public class ByteToStringExample {
   public static void main(String[] args) {
	byte[] bytes = {71, 111, 111, 68, 32, 77, 65, 73, 76, 73, 66, 85 };
	
	String str1 = new String(bytes);
	System.out.println(str1);
	
	String str2 = new String(bytes, 5, 7);
	System.out.println(str2);
}
}
