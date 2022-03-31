package com.dev;

public class SwitchExample2 {
    public static void main(String[] args) {
		//90점 A, 80점 B, 70점 C, 60점 D, 그외 F
	int score = 100/10; //> 하나의 값으로 만들기
	
	switch (score) {
	case 10:
		System.out.println("100점 입니다.");
		break;
	case 9:
		System.out.println("A 입니다.");
		break;
	case 8:
		System.out.println("B 입니다.");
		break;
	case 7:
		System.out.println("C 입니다.");
		break;
	case 6:
		System.out.println("D 입니다.");
		break;
	default: 
		System.out.println("F 입니다."); 
	break;

	
	}
	
    
    
    
    }
}
