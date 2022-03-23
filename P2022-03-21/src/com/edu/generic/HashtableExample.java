package com.edu.generic;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableExample {
   public static void main(String[] args) {
	Map<String, String> map = new Hashtable<String, String>();
	//map는 key와 value를 함께 가지고 있음.
	//Map은 리스트나 배열처럼 순차적으로(sequential) 해당 요소 값을 구하지 않고 key를 통해 value를 얻는다. 
	//맵(Map)의 가장 큰 특징이라면 key로 value를 얻어낸다는 점이다. 
	//baseball이란 단어의 뜻을 찾기 위해서 사전의 내용을 순차적으로 모두 검색하는 것이 아니라 baseball이라는 단어가 있는 곳만을 펼쳐보는 것이다.
	
	map.put("김상수", "에이스");
	map.put("김지찬", "땅딸보");
	map.put("원태인", "탈모");
	map.put("김동엽", "벌레"); //아이디와 비밀번호를 미리 저장
	
	Scanner scn = new Scanner(System.in);
	
	while(true) {
		System.out.println("아이디랑 비밀번호 적어라.");
		
		System.out.println("아이디: ");
		String id = scn.nextLine();
		
		System.out.println("비밀번호: ");
		String password = scn.nextLine();
		System.out.println();
		
		if(map.containsKey(id)) {
			if(map.get(id).equals(password)) {
				System.out.println("로그인 됐다고.\n");
				break;
			} else {
				System.out.println("비밀번호가 틀리다 임마.\n");
			}
		} else {
			System.out.println("아이디 똑바로 쳐라 임마.\n");
		}
	}
	
}
}
