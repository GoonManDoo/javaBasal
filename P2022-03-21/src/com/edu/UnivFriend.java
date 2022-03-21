package com.edu;

public class UnivFriend extends Friend {
//학교: 학교이름, 전공
	private String university;
	private String major;
	
	
	
	public UnivFriend() {
		super();
	}
	
	public UnivFriend(String name, int age, double height, double tall, String phone) {
		super(name, age, height, tall, phone); //Friend(이름, 나이, 키, 몸무게, 폰);
	
	}


    public UnivFriend(String name, int age, double height, double tall, String phone, String university, String major) 
{
	    super(name, age, height, tall, phone); //Friend(이름, 나이, 키, 몸무게, 폰);
        this.university = university;
        this.major = major;
}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		String str = "친구의 이름은 " + super.getName() + "이고 \n";
		str += "나이는 " + super.getAge() + "살이고\n";
		str += "연락처는 " + this.getPhone() + "입니다.\n";
		str += "==============< 추가 정보 > ================\n";
		str += "학교 이름은 " + this.getUniversity() + "이고 \n";
		str += "전공은 " + this.getMajor() + " 입니다.\n";
		str += "===========================================\n";
		return str;
	}
	
}

