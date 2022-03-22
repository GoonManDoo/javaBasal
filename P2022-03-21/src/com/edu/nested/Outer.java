package com.edu.nested;

public class Outer {
   private String field1;
   private int field2;
   
   class Inner { //<<내부클래스 중에 멤버클래스.
	   String Field3;
	   int field4;
	   
	   void method2() {
		   System.out.println("Inner.method2()");
	   }
   }
   // 함수적 인터페이스: 구현해야 할 메소드가 하나인 것.
   interface Runnable { //run이라는 추상메소드를 가지고 있
	   void run(); 
   }
   
   class Bus implements Runnable {

	@Override
	public void run() {
		System.out.println("Bus가 달립니다.");
		
	}
	   
   }
   
   public String getField1() { //<<메소드
	   return field1;
   }
   public void method1() {
	   System.out.println("Outer.method1()");
       Inner inner = new Inner();
       inner.method2();
   }
   public void method3() {
	   System.out.println("Outer.method3()");
	   
	   class Local { // 로컬클래스
		   
		   void method4() {
			   System.out.println("Local.method4()");
		   }
	   }
       Local local = new Local();
       local.method4();
   }
    public void method4() {
       Runnable runnable = new Bus(); //인터페이스의 구현객체 가능.
       runnable.run();
    
       //익명구현객체.
       // Lambda 표현식.
       runnable = () ->  System.out.println("임의의 객체를 실행합니다.");//function			
		
       runnable.run();
    
    }
}
