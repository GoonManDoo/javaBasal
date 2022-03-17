package com.dev;

public class Account {
   //계좌정보, 예금주, 예금액
   // field.
   private String accNo;
   private String accName;
   private int Money;

   // constructor: 생성자. 목적은 필드의 초기값을 지정.
   
   
   // method.
   public String getAccNo() {
	return accNo;
}
public Account(String accNo, String accName, int money) {
	super();
	this.accNo = accNo;
	this.accName = accName;
	this.Money = money;
}
public void setAccNo(String accNo) {
	this.accNo = accNo;
}
public String getAccName() {
	return accName;
}
public void setAccName(String accName) {
	this.accName = accName;
}
public int getMoney() {
	return Money;
}
public void setMoney(int money) {
	Money = money;
}
@Override
public String toString() {
	return "Account [accNo=" + accNo + ", accName=" + accName + ", Money=" + Money + "]";
}
   
}
