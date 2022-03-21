package com.edu;

public class Person extends Object{ //오브젝트 넣으면 
	// field.
    //이름, 나이, 키, 몸무게
	private String name;
	private int age;
	private double tall;
	private double weight;
	
	//constructor(생성자)
	// overloading(생성자 중복선언)
	public Person() {
		
	}
	public Person(String name) {
		this.name = name;
	}
	
	public Person(String name, int age, double tall, double weight) {
		this.name = name;
		this.age = age;
		this.tall = tall;
		this.weight = weight;
	}
	// method/
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getTall() {
		return tall;
	}
	public void setTall(double tall) {
		this.tall = tall;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}

	
	

}