package com.edu;

public class Vehicle {
   
	private int maxSpeed;
	
	public Vehicle() {
		this.maxSpeed = 100;
	}
	
	
	public int getMaxSpeed() {
		return maxSpeed;
	}


	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}


	public void run() {
	   System.out.println("군만두가 달립니다.");
	   }

   public void stop() {
	   System.out.println("군만두가 멈춥니다.");
   }


@Override
public String toString() {
	String vehicles = "제일빠른거: " + this.getMaxSpeed() + "km 입니다\n";
	                 
	return vehicles;
}


}
