package com.edu;

public class CompanyFriend  extends Friend{
//회사: 회사이름, 회사업무
	private String Company;
	private String job;
	
	public CompanyFriend() {} // super();
	
	
	
	public CompanyFriend(String name, int age, double height, double tall, String phone, String company, String job) {
		super(name, age, height, tall, phone);
		this.Company = company;
		this.job = job;
	}
	


	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}



	@Override
	public String toString() {
		String str = "친구의 이름은 " + super.getName() + "이고 \n";
		str += "나이는 " + super.getAge() + "살이고\n";
		str += "연락처는 " + this.getPhone() + "입니다.\n";
		str += "==============< 추가 정보 > ================\n";
		str += "회사 이름은 " + this.getCompany() + "이고 \n";
	    str += "하는 일은 " + this.getJob() + " 입니다. \n";
		return str;
		
	}



}
