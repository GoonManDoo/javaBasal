package com.dev;

import java.util.Scanner;

public class WhileExample4 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// 은행 계좌를 만들어서 1:입금, 2:출금, 3:종료
		// 입금일 경우: 입금액을 입력하세요. + account 값을 누적
		// 출금일 경우: 출금액을 입력하세요. -account 값을 차감
		// 종료일 경우: 프로그램 종료.
		// account 값은 0으로 초기화
		// Scanner, account while으로 선언
		
		int account = 0;
		while(true) {
		System.out.println("1:입금 " + "2:출금 " + "3:종료 ");
		int menu = scn.nextInt();
		if (menu == 1) {
			System.out.println("입금액을 입력하세요.");
			account += scn.nextInt();
			System.out.println("잔액은 " + account + "원입니다");

		} else if (menu == 2) {
			System.out.println("출금액을 입력하세요.");
			account -=scn.nextInt();
			if (account < 0) {
				System.out.println("잔액이 부족합니다.");
				System.out.println("현재 잔액: " + account);
				continue; //구문 아래를 무시하고 다음 순번으로 넘어감
				
			}
			System.out.println("잔액은 " + account + "원입니다");
		} else if (menu == 3) {
			System.out.println("프로그램을 종료합니다.");
			break;
		}

	}
	}
}

//    	int menu;
//    	int account = 0;
//    	int incash;
//    	int outcash = 0;
//    	
//    	while(true) {
//    	System.out.println("1:입금 " + "2:출금 " + "3:종료 ");
//    	menu = scn.nextInt();
//        if(menu == 1) {
//        	System.out.println("입금액을 입력해 주세요.");
//        	incash = scn.nextInt();
//        	account = account + incash;
//        	System.out.println("현재 잔액은 " + account + " 원입니다.");
//        	
//        } else if(menu == 2) {
//        	System.out.println("출금액을 입력해 주세요.");
//        	outcash = scn.nextInt();
//        	account = account - outcash;
//        	System.out.println("현재 잔액은 " + account + " 원입니다.");
//        	
//        } else {
//        	System.out.println("프로그램을 종료합니다.");
//        	break;
//        	}
//         }
//    }
//}
