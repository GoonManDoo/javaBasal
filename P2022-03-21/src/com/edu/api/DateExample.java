package com.edu.api;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class DateExample {
   

public static void main(String[] args) {
	
	  Date today = new Date("2022/01/01 00:00:00");
	  today.setYear(1); //1900년.
	  System.out.println(today);
	  
	  SimpleDateFormat sdf = new SimpleDateFormat("yyy년MM월dd일 hh시mm분ss초");
	  System.out.println(sdf.format(today));
	  
	  LocalDateTime time = LocalDateTime.now();
      System.out.println(time.getYear());

}
}
