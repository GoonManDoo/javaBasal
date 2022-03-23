package com.edu.api;

public class IDCheck {
   public void getGender2(String sno) {
	   String newSno = sno.replace("-", "");
	   newSno = sno.replace(" ", "");
   }

	//주민번호 입력 -> 950304-1234567, 000205-4567890
   //950304-1234567, 950304 1234567, 9503041234567
	//String getGender() -> 남자, 여자.
	public String getGender(String ssn) {
		char sex = 0;
		
		String result = null; //초기화
		if (ssn.length() == 13) { //7번째 위치
			sex = ssn.charAt(6);
		} else if (ssn.length() == 14) { //8번째 위치
			sex = ssn.charAt(7);
		
		} else {
			
		}
		switch(sex) {
		   case '1':
		   case '3':
			  
			   System.out.println("남자입니다.");
			   break;
		  
		   case'2':
		   case'4':
			   System.out.println("여자입니다");
			   break;
		   default:
			   System.out.println("사람이 아닙니다.");
	}
		return ssn;
}
}
//public String getGender(String ssn) {
//	try {
//      ssn = ssn.replace("-", "");
//	  ssn = ssn.replace(" ", "");
//	  char sex = ssn.charAt(6);
//	
//	switch(sex) {
//	   case '1':
//	   case '3':
//		  
//		   System.out.println("남자입니다.");
//		   break;
//	  
//	   case'2':
//	   case'4':
//		   System.out.println("여자입니다");
//		   break;
//	   default:
//		   System.out.println("사람이 아닙니다.");
//}
//	} catch (Exception e) {
//		System.out.println("잘못된 입력입니다.");
//	}
//	return null;
//	}
//
//}
