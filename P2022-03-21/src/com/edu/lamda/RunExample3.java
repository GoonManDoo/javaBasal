package com.edu.lamda;

interface Runnable3 {
	public int run(String str);
	
}
public class RunExample3 {
   public static void main(String[] args) {
	  Runnable3 runnable = (String str) -> {
		return str.length();  
	  };
	  runnable.run("Hello, World");
	  int lnth = runnable.run("Hello, World");
	  System.out.println(lnth);
}
}
