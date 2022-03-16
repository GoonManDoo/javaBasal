package com.prod;

public class Car {
    //모델, 현재속도, 최고속도, 가속(현재 속도 10키로씩 증가) 감속(10키로씩 감소) 현재속도()
    private String mode1;
    private int speed;
    private int maxspeed;
    
    
    
    public void setMode1(String mode1) {
		this.mode1 = mode1;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void setMaxspeed(int maxspeed) {
		this.maxspeed = maxspeed;
	}
	public void addSpeed() {
    	if(this.speed >= this.maxspeed) {
		System.out.println("최고속도를 초과할 수 없습니다.");
		return;
    	}
		System.out.println("10km 가속합니다.");
		this.speed += 10; }
    
    public void breakSpeed() {
    	System.out.println("10km 감속합니다.");
    	this.speed -= 10;
    }
    public int getSpeed() {
    	return this.speed;
    
    }
    }
    