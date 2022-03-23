package com.edu.generic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
   public static void main(String[] args) {
	  // Map: {key, value}, {key1:value1}, 
	   Map<String, Integer> map = new HashMap<String, Integer>();
	   map.put("이유빈", 61);
	   map.put("김상수", 65);
	   map.put("김영민", 95); 
	   map.put("김영민", 88); //중복이면 나중에 입력된 값이 출력됨
	   // 컬렉션: 여러값을 저장. => 여러요소 접근.
       
	   Integer val = map.get("김영민");
       System.out.println(val);
       
       Set<String> keySet = map.keySet(); //map 컬렉션에 저장된 요소들의 키에 해당 값을 Set컬렉션에 담아줌.
       // 1)
       Iterator<String> iter = keySet.iterator();
       
       while(iter.hasNext()) {
    	   String key = iter.next();
    	   Integer value = map.get(key);
    	   System.out.printf("key: %5s, value: %5d\n", key, value);//첫번째 %는 첫번째 값, 두번째 %는 두번째 값.
       }
          //2) for( : ) 확장for
        for(String key : keySet) { //keyset 값을 가져오면 이유빈의 값을 가져오고, 밑에 map.get.key가 값을 줌
        	Integer value = map.get(key);        
        	}
       
       
       System.out.println("end of prog");
   }
}
