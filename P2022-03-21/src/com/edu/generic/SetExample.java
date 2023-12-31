package com.edu.generic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
   public static void main(String[] args) {
	  
      Set<String> set = new HashSet<String>(); //set:중복값은 허용x
      set.add("그만해");
      set.add("이러다");
      set.add("다 죽어");
      set.add("이러다"); //중복된 요소는 추가불가
   
      System.out.println("set 크기: " + set.size());
      
     Iterator<String> iter = set.iterator(); //반복좌?
     while(iter.hasNext()) {
    	 String result = iter.next();
    	 System.out.println(result);
     }
     System.out.println("end of prog");
   }
}
