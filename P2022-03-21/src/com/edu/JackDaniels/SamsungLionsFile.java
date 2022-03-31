package com.edu.JackDaniels;

import java.io.*;
import java.util.*;


// StudentServiceImpl(중첩클래스의 기능대체)
// 입력, 수정, 삭제 => 파일에 저장이 되도록.
public class SamsungLionsFile implements SamsungLionsService {

	//↓ 필드
	List<SamsungLions> list = new ArrayList<SamsungLions>();
	File file;
	
	// 기본생성자의 파일에 저장되어 있는 파일정보를 읽어서 list 컬렉션에 값을 담아준다.
	// ↓ 생성자
	public SamsungLionsFile() {
	   try {
		FileReader fr = new FileReader("studentList.data");
	    BufferedReader br = new BufferedReader(fr);
	    String readBuffer = null;
	    while((readBuffer = br.readLine()) !=null) {
	    	  String[] contents = readBuffer.split(","); // 101, 홍길동, 80, 90 콤마로 분리, 구분
//	          contents[0] <= 101, contents[1] <= 홍길동, contents[2] <= 80, contents[3] <= 90
	         list.add(new SamsungLions(Integer.parseInt(contents[0]), //
	                   contents[1],
	                   Integer.parseInt(contents[2]), //
	                   Integer.parseInt(contents[3]) //
	                   ));
	    }
	   br.close();
	   fr.close();
	    
	   } catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
    //↓ 메소드
	@Override
	public void insertSamsung(SamsungLions samsung) {
		list.add(samsung); // 추가.
	}

	@Override
	public SamsungLions getSamsung(int sno) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getBno() == sno) {
				return list.get(i);
			}
		}
		return null; // 리스트를 리턴하겠습니다.
	}

	@Override
	public List<SamsungLions> samsungList() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public void modifySamsung(SamsungLions samsung) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getBno() == samsung.getBno()) {
				list.get(i).setBtitle(samsung.getBtitle()); // 제목수정.
				list.get(i).setContent(samsung.getContent()); // 내용수정.
				list.get(i).setWriter(samsung.getWriter()); // 작성자수정.
				list.get(i).setDate(samsung.getDate()); // 작성일수정.
			
			
			}
		}
	}

	@Override
	public void removeSamsung(int sno) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getBno() == sno) {
				list.remove(i);
				System.out.println("삭제했습니다.");
				break;
			} else {
				System.out.println("없습니다.");
			}
		}

	}

	@Override
	public List<SamsungLions> searchSamsung(String name) {
		List<SamsungLions> searchList = new ArrayList<SamsungLions>();
		// 찾았다고 종료 X
		for (int i = 0; i < list.size(); i++) {
			// 같은 이름이 있는지 찾아보고 있으면 searchList.add()
			if (list.get(i).getBtitle().equals(name)) { // equals 메소드는 비교하고자 하는 대상의 내용 자체를 비교
				searchList.add(list.get(i));
			}
		}
		return searchList;
	}

	@Override
	public void saveToFile() {
		// TODO Auto-generated method stub
		try {
			FileWriter fw = new FileWriter("studentList.data");
			BufferedWriter bw = new BufferedWriter(fw); // 보조스트림의 생성자의 매개값으로 기본스트림을 넣으면 된다.

			for (SamsungLions stud : list) {
				bw.write(stud.getBno() + "," + stud.getBtitle()//
						+ "," + stud.getContent() + "," + stud.getWriter() + "," + stud.getDate() + "\n");
			}
			bw.close();
			fw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
