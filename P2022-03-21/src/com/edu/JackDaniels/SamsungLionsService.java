package com.edu.JackDaniels;

import java.util.List;

public interface SamsungLionsService {

	
	public void insertSamsung(SamsungLions samsung); //입력용도.
	public List<SamsungLions> samsungList(); //전체목록.
	public SamsungLions getSamsung(int sno); //한건조회.
	public void modifySamsung(SamsungLions samsung); //한건수정
	public void removeSamsung (int sno); //한건삭제
	public List<SamsungLions> searchSamsung(String name); //이름조회
	public int loginSamsung(String id, String pw); //로그인
	
	 public int writeNum();
	
	
	
	
    






}
