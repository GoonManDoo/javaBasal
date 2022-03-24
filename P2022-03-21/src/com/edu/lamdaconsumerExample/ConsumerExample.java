package com.edu.lamdaconsumerExample;

import java.util.function.*; //*붙이면 function 밑에 있는거 다 임포트 하겠다는 뜻이다 알았냐


public class ConsumerExample {
    public static void main(String[] args) {
		
    	// functional interface 함수적 인터페이스 : 람다표현식 가능. 
    	Consumer<String> consumer  = (t) -> {
          System.out.println(t + "출력합니다.");
    	};
	    consumer.accept("메세지를 ");
	    
       
	    //매개값이 2개 들어옴
	    BiConsumer<Integer, Integer> biCon = (t, u) -> {
	    	System.out.println("result => " + (t + u));

							
			};
	    biCon.accept(20,  40);
    }
    }

