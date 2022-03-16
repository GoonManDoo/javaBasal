package com.prod;

public class User1Example {
public static void main(String[] args) {
		
	
    User1 u1 = new User1();
	u1.setUserId(101);
	u1.setUserRank("A");
	u1.setUserTel("111-1111-1111");
	u1.setUserPoint(1001);
	
	User1 u2 = new User1();
	u2.setUserId(102);
	u2.setUserRank("B");
	u2.setUserTel("222-2222-2222");
	u2.setUserPoint(900);
	
	User1 u3 = new User1();
	u3.setUserId(103);
	u3.setUserRank("C");
	u3.setUserTel("333-3333-3333");
	u3.setUserPoint(700);
	
	User1 u4 = new User1();
	u4.setUserId(104);
	u4.setUserRank("D");
	u4.setUserTel("444-4444-4444");
	u4.setUserPoint(500);
	
	System.out.println(u1.getEmpInfo());
	System.out.println(u2.getEmpInfo());
	System.out.println(u3.getEmpInfo());
	System.out.println(u4.getEmpInfo());
	
	User1[] Users = {u1, u2, u3, u4};  //객체설정
	   for(int i = 0; i < Users.length;i++) {
		   if (Users[i].getUserPoint() > 1000 && Users[i].getUserRank() == "A") {
       System.out.println("사용자 등급이 A이고, 1000포인트 이상인 사람은 " + Users[i].getUserId());
    }
}
}
}


//User 클래스 (사용자아이디, 사용자등급(A,B,C), 사용자연락처, 사용자포인트
//- Getters, Setters, 사용자정보를 보여주는 메소드(getUserInfo())
//- 배열에 저장하도록 User[ ] users > 출력..사용자등급: A, 1000포인트 이상