package com.edu.except;

public class SlowEx {
   public static void main(String[] args) {
	showInterval("군만두 장인 김영민 선생.");
}

   private static void showInterval(String str) {
	for (int i = 0; i < str.length(); i++) {
		System.out.print(str.charAt(i));
		try {
			Thread.sleep(300);// 300>0.3초
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
	}
	
}
}
