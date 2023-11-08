package com.edu.interfaces;

public class MysqlDao implements Dao {

	@Override
	public void select() {
		System.out.println("MySQL DB에서 조회합니다.");
	}

	@Override
	public void insert() {
		System.out.println("MySQL DB에서 입력합니다.");
	}

	@Override
	public void update() {
		System.out.println("MySQL DB에서 수정합니다.");
	}

	@Override
	public void delete() {
		System.out.println("MySQL DB에서 삭제합니다.");
	}

	@Override
	public void powerOn() {
		
	}

	@Override
	public void powerOff() {
		
	}

	@Override
	public void start() {
		
	}

	@Override
	public void end() {
		
	}

}