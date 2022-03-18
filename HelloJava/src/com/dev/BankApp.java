package com.dev;

import java.util.Scanner;

// BankApp(main method), Account(계좌번호, 예금주, 잔액) 
public class BankApp {
  static  Account[] banks = new Account[100];
   static Scanner scn = new Scanner(System.in);
// 메뉴: 1. 계좌생성(계좌번호,예금주,예금액)
		// 2. 예금(계좌번호,예금액) -> 최고 예금액 100,000원
		// 3. 출금(계좌번호,출금액) -> 잔액보다 큰 금액은 출금 못하도록.
		// 4. 잔액조회(계좌번호)
		// 5. 종료.
   
   public static void main(String[] args) {
		
	   while(true) {
		   printMenu();
		   int menu = scn.nextInt();
		   
		   if(menu == 1) {
			   createAccount();
		   } else if (menu == 2) {
			   deposit();
		   } else if (menu == 3) {
			   withdraw();
		   } else if (menu == 4) {
			   findAccountMoney();
		   } else if (menu == 5) {
			   transferAmount();	   
		   } else if (menu == 6) {
			   System.out.println("프로그램을 종료합니다.");
			   break;
		   } else if (menu == 9) {
			   showList();
		   }
	   }
	   System.out.println("계좌가 정상적으로 생성되었습니다.");
	   System.out.println("=== End of Prog ===");
	}//end of main()
   //메뉴출력 기능
    public static void printMenu() {
    	String menu = "===========================================\r\n"
    			+ "    1.계좌생성(번호,예금주,예금액)\r\n"
    			+ "    2.예금(번호,예금액) -> 최고예금액 100,000원." 
    			+ "    3.출금(번호,예금액) -> 잔액보다 큰 금액 출금 못하도록." 
    		    + "    4.잔액조회(번호)\r\n"
    		    + "    5.송금(송금계좌, 금액, 입금계좌)\r\n"// transferAmount()
    		    + "    6.종료."
    		    + "===============================================";
    System.out.println(menu);
    }
//   계좌생성 메소드 //이프문
//	public static void createAccount() {
//      System.out.println("계좌생성기능");
//	  System.out.println("계좌번호입력>> ");
//	  String accNo = scn.next();
//	  System.out.println("예금주입력>> ");
//	  String accName = scn.next();
//	  System.out.println("예금액입력>> ");
//	  int accMoney = scn.nextInt();
//	  //계좌번호 있는지 체크
//	  if(searchAccountNo(accNo) !=null) {
//		  System.out.println("이미 있는 계좌번호입니다.");
//		  return;
//	  }
//	  
//	  Account accnt = new Account(accNo, accName, accMoney);
//	  
//	  for(int i=0; i < banks.length; i++) {
//		  if(banks[i] == null) {
//			  banks[i] = accnt;
//			  break;
//		  }
 // 계좌생성 메소드.//와일문
    public static void createAccount() {
       System.out.println("계좌생성가능.");
       String accNo;

       while (true) {
          System.out.println("계좌번호입력>> ");
          accNo = scn.next(); // 사용자의 코드를 문자열 형태로 반환해준다.
          System.out.println("예금주입력 >>");
          String accName = scn.next();
          System.out.println("예금액입력 >>");
          int accMoney = scn.nextInt();

          // 계좌번호 있는지 체크.
          if (searchAccountNo(accNo) != null) {
             System.out.println("이미 있는 계좌번호입니다.");
             continue; // 빠져나올 때 쓰는 구만 (밑의 코드를 실행 안
          }

          Account accnt = new Account(accNo, accName, accMoney); // 초기화하는데, 이러한 것들을 가지고 초기화 하겠습니다.

          for (int i = 0; i < banks.length; i++) {
             if (banks[i] == null) {
                banks[i] = accnt;
                System.out.println("계좌가 정상적으로 생성되었습니다.");
                break;
             }
          }
          break;
       }
}
	
	
	//예금 메소드	
	public static void deposit() {
		System.out.println("예금기능");
	    System.out.println("계좌번호>> ");
	    String ano = scn.next();
	    System.out.println("예금액 입력>> ");
	    int amt = scn.nextInt();
	    int checkCnt = 0; //조회가 됐는지 체크 여부 변수
	    for(int i = 0; i < banks.length; i++ ) {
	    	if(banks[i] !=null && banks[i].getAccNo().equals(ano)) { //계좌번호 있을 경우.
	    		// 계좌번호 조회됐을 때..
	    		checkCnt = 1; //찾는 조건에 맞게 계좌존재.
	    		int currAmt = banks[i].getMoney();
	    		
	    		// 예금액이 10만원을 초과하지 못하도록...
	    		if(currAmt + amt > 100000) {
	    			checkCnt = 2;
	    			
	    		break;
	    		}
	    		
	    	}
	    }
	    if(checkCnt == 1) {
	    System.out.println("정상적으로 처리되었습니다.");
	    } else if (checkCnt == 2) {
	    	System.out.println("한도액을 초과했습니다.");
	    } else {
	    	System.out.println("계좌번호가 없습니다.");
	    }
	}

	
	
	
	
	//출금 메소드   
    public static void withdraw() {
    	System.out.println("출금기능");
    	System.out.println("출금하실 계좌를 입력하세요");
    	String amt = scn.next();
    	
	    int checkCnt = 0; //조회가 됐는지 체크 여부 변수
	    for(int i = 0; i < banks.length; i++ ) {
	    	if(banks[i] !=null && banks[i].getAccNo().equals(amt)) { //계좌번호 있을 경우.
	    		// 계좌번호 조회됐을 때..
	    		checkCnt = 1; 	    		
	    		int currAmt = banks[i].getMoney();
	    		System.out.println("출금하실 금액을 입력하세요");
	    		int outMoney = scn.nextInt();
	    		// 예금액이 10만원을 초과하지 못하도록...
	    		if(currAmt - outMoney < 0) {
	    			checkCnt = 2;
	    			
	    		break;
	    		}
	    		banks[i].setMoney(currAmt- outMoney); // 잔액 + 입금액
	    		break;
	    	}
	    }
	    if(checkCnt == 1) {
	    System.out.println("정상적으로 처리되었습니다.");
	    } else if (checkCnt == 2) {
	    	System.out.println("한도액을 초과했습니다.");
	    } else {
	    	System.out.println("계좌번호가 없습니다.");
	    }
	}   
    //계좌이체 메소드
    public static void transferAmount() {
       System.out.println("송금할 계좌>> ");
       String sendAccntNo = scn.next();
       System.out.println("송금할 금액>> ");
       int amt = scn.nextInt();
       System.out.println("입금받을 계좌>> ");
       String receiveAccntNo = scn.next();
       
       Account sendAccnt = searchAccountNo(sendAccntNo);
       Account receiveAccnt = searchAccountNo(receiveAccntNo);
       
       if (sendAccntNo.equals(receiveAccnt)) {
    	   System.out.println("송금계좌와 입금계좌가 동일합니다.");
    	   return;
       } else if (sendAccnt == null) {
    	   System.out.println("송금계좌정보가 정확하지 않습니다.");
    	   return;
       } else if (receiveAccnt == null ) {
    	   System.out.println("");
       }
    	//    	=============================================================
//    	System.out.println("출금기능");
//    	System.out.println("출금하실 계좌를 입력하세요");
//    	String amt = scn.next();
//    	System.out.println("송금하실 계좌를 입력하세요");
//    	String atm = scn.next();
//    	
//	    int checkCnt = 0; //조회가 됐는지 체크 여부 변수
//	    for(int i = 0; i < banks.length; i++ ) {
//	    	if(banks[i] !=null && banks[i].getAccNo().equals(amt)) { //계좌번호 있을 경우.
//	    		// 계좌번호 조회됐을 때..
//	    		checkCnt = 1; 	    		
//	    		int currAmt = banks[i].getMoney();
//	    		System.out.println("출금하실 금액을 입력하세요");
//	    		int outMoney = scn.nextInt();
//	    		// 예금액이 10만원을 초과하지 못하도록...
//	    		if(currAmt - outMoney < 0) {
//	    			checkCnt = 2;
//	    		break;
//	    		}
//	    		banks[i].setMoney(currAmt - outMoney); // 잔액 + 입금액
//	    		break;
//	    	}
//	    	}
//	    ===============================================================================
	    if(checkCnt == 1) {
	    System.out.println("정상적으로 처리되었습니다.");
	    } else if (checkCnt == 2) {
	    	System.out.println("한도액을 초과했습니다.");
	    } else {
	    	System.out.println("계좌번호가 없습니다.");
	   
	    }
	    }
	    
    
	    
    
    
    //========================================================
    //계좌이체 메소드
//    public static void transferAmount() {
// 	   System.out.println("조회기능");
// 	   System.out.println("계좌번호>> ");
// 	   String ano = scn.next();
// 	   Account findAccount = searchAccountNo(ano);
// 	   if (findAccount == null) {
// 		   System.out.println("계좌가 존재하지 않습니다.");
// 		   return ;
// 	   }
// 	   System.out.println("잔액: " + findAccount.getMoney());
// 	   }
//   ===================================================================
    //잔액조회 메소드, 내가 만든거
//    public static void findAccountMoney() {
//    	System.out.println("잔액조회기능");	
//    	System.out.println("계좌번호를 입력하세요.");
//    	String num1 = scn.next();
//    	int checkCnt = 0; //조회가 됐는지 체크 여부 변수
//	    for(int i = 0; i < banks.length; i++ ) {
//	    	if(banks[i] !=null && banks[i].getAccNo().equals(num1)) { //계좌번호 있을 경우.
//	    		// 계좌번호 조회됐을 때..
//	    		checkCnt = 1; 
//	    		int currAmt = banks[i].getMoney();
//	    		banks[i].setMoney(currAmt);
//	    		
//	    	}
//       if (checkCnt == 1) {
//         System.out.println("잔액은 " + banks[i].getMoney() + " 원입니다.");
//       } else if (checkCnt == 2) {
//    	   System.out.println("잔액을 조회할 수 없습니다.");
//       }
//       break;
	    //잔액조회 메소드, 교수님이 만든거
       public static void findAccountMoney() {
    	   System.out.println("조회기능");
    	   System.out.println("계좌번호>> ");
    	   String ano = scn.next();
    	   Account findAccount = searchAccountNo(ano);
    	   if (findAccount == null) {
    		   System.out.println("계좌가 존재하지 않습니다.");
    		   return ;
    	   }
    	   System.out.println("잔액: " + findAccount.getMoney());
    	   }
    			   
      
	    
	    
	    
    
    // 전체리스트 출력.
    public static void showList() {
    	for(int i=0; i<banks.length; i++) {
    		if(banks[i] !=null) {
    			System.out.println(banks[i].toString());
    		}
    	}
    }
//계좌번호를 입력하면 배열(bank)에서 그 계좌번호를 반환, 없으면 null
//100개 중 35개 저장    
    public static Account searchAccountNo(String accNo) {
    	for(int i = 0; i<banks.length; i++) {
    		if(banks[i] != null && banks[i].getAccNo().equals(accNo)) {
    			return banks[i];
    			
    		}
    	
    }
     return null; //클래스 -> null(Student, Car, 
}
}
