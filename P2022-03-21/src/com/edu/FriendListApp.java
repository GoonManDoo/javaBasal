package com.edu;

public class FriendListApp {
   public static void main(String[] args) {
	Friend[] friends = new Friend[10];
	
	Friend f1 = new Friend();
    f1.setName("군만두");
    f1.setAge(25);
    f1.setTall(173.3);
    f1.setWeight(68.9);
    f1.setPhone("010-2323-9845");
    
    UnivFriend f2 = new UnivFriend("물만두", 29, 178.3, 69.2, "010-1111-2222");
    f2.setUniversity("대구대학교");
    f2.setMajor("컴퓨터공학과");
    
    
    CompanyFriend f3 = new CompanyFriend("찐만두", 29, 173.3, 75.2, "010-2222-3333", "네이버", "지도app개발연구원");
    
    friends[0] = f3;
    friends[1] = f3;
    friends[2] = f3;
    friends[3] = f3;
    friends[4] = f3;
    friends[5] = f3;
    
    Friend f4 = new Friend();
    f4.setName("군만두");
    f4.setAge(25);
    f4.setTall(173.3);
    f4.setWeight(68.9);
    f4.setPhone("010-2323-9845");
    
    UnivFriend f5 = new UnivFriend("물만두", 29, 178.3, 69.2, "010-1111-2222");
    f5.setUniversity("대구대학교");
    f5.setMajor("컴퓨터공학과");
    
    
    CompanyFriend f6 = new CompanyFriend("찐만두", 29, 173.3, 75.2, "010-2222-3333", "네이버", "지도app개발연구원");
    
    friends[0] = f1;
    friends[1] = f2;
    friends[2] = f3;
    friends[3] = f4;
    friends[4] = f5;
    friends[5] = f6;
    
    for(int i=0; i<friends.length; i++) {
    	if(friends[i] != null)//&& friends[i] instanceof UnivFriend)
    	System.out.println(friends[i].toString());
    	// 동일하나 기능이지만 인스턴스 종류에 다른 결과실행 => 다형성.   
    
    }
   Friend friend = f6; // UnivFriend; getUniversity, getMajor
   friend = f4;
   UnivFriend uni = null; //(UnivFriend) friend.
   if(friend instanceof UnivFriend) { //uni변수값이 UnivFriend의 인스턴스인지
      uni = (UnivFriend) friend; //Casting 해야함.
      uni.getUniversity();//부모클래스의 참조변수 =>  자식클래스의 참조변수에 할당 가능.
   }
}
}