package com.dev;

public class AccExample {
   public static void main(String[] args) {
	Account[] accounts;
	
	accounts = new Account[] { new Account("1-111", "Hong")//
			, new Account("1-111", "Hwang")//"
			, new Account("1-113", "Kim")//		
	};
//    Account a1 = new Account(); //실체를 생성.
      System.out.println(Account.bankName);    
      Account.showBankName();
      
      //쉐어하우스..주방, 거실 vs 방, 방...
      Calcurator.sum(10, 20);
      
      Calcurator c1 = new Calcurator();
      c1.sum(10, 20);
      
      Calcurator.getArea(10);
      
      // static 활용.
      
   
   
   
   }
     
}
