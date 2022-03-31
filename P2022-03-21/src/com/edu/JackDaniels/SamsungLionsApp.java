package com.edu.JackDaniels;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SamsungLionsApp {
	// 필드 ↓
	List<SamsungLions> list = new ArrayList<SamsungLions>();
	Scanner scn = new Scanner(System.in);

	// 생성자
	public SamsungLionsApp() {

		list.add(new SamsungLions(101, "제목1", "내용1", "작성자1", "작성시간1"));
		list.add(new SamsungLions(102, "제목2", "내용2", "작성자2", "작성시간2"));
		list.add(new SamsungLions(103, "제목3", "내용3", "작성자3", "작성시간3"));
		list.add(new SamsungLions(104, "제목4", "내용4", "작성자4", "작성시간4"));
	}

	// 멤버클래스. // 밑처럼 하는 이유는 해당 클래스에서만 사용하고 싶기 때문이다.
	class SamsungServiceImpl implements SamsungLionsService {
		@Override
		public void insertSamsung(SamsungLions samsung) {
			list.add(samsung); // 추가.
		}

		@Override
		public SamsungLions getSamsung(int sno) { // 학생번호로 한건 조회.
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getBno() == sno) {
					return list.get(i);
				}
			}
			return null; // 리스트를 리턴하겠습니다.
		}

		@Override
		public List<SamsungLions> samsungList() { // 전체 리스트.
			return list;
		}

		public void modifyStudent(SamsungLions samsung) { // 수정.
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
		public void removeSamsung(int del) { // 한건삭제
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getBno() == del) {
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
				if (list.get(i).getWriter().equals(name)) { // equals 메소드는 비교하고자 하는 대상의 내용 자체를 비교
					searchList.add(list.get(i));
				}
			}
			return searchList;
		}

		@Override
		public void saveToFile() {
			// TODO Auto-generated method stub

		}

		@Override
		public void modifySamsung(SamsungLions samsung) {
			// TODO Auto-generated method stub

		}

	} // end of StudentServiceImpl

	// 메인기능을 담당하는 execute()
	public void execute() {
		SamsungLionsService service = null;
		// service = new StudentServiceImpl();// StudentService는 인터페이스
		// StudentServiceImpl는 구현객체이다.
		// service = new StudentServiceFile();
		service = new SamsungLionsServiceOracle();

		// 메뉴: 1.추가 2.리스트 3.한건조회 4.수정 5.한건삭제 6.이름조회(이름) 9.종료
		// 메뉴: 1.게시글번호 2.제목 3.내용 4.작성자 5.작성일시 6.수정 7.한건삭제 8.이름조회 9.종료
		// 메뉴: 1.게시글작성 2.리스트 3.한건조회 4.수정 5.한건삭제 6.이름조회 9.종료
		// 메뉴1 : 게시글 번호, 제목, 내용, 작성자, 작성일시
		while (true) {
			System.out.println("삼성라이온즈 게시판에 오신걸 환영합니다.");
			System.out.println("1.게시글 추가 2.게시글 목록 3.게시글 조회 4.게시글 수정 5.게시글 삭제 6.작성자 조회 9.종료");
			System.out.println("선택>> ");

			int menu = scn.nextInt();
			if (menu == 1) {
				// 메뉴1 : 게시글 번호, 제목, 내용, 작성자, 작성일시
				System.out.println("게시글 번호를 입력하세요: ");
				int bNo = scn.nextInt();
				System.out.println("게시글 제목을 입력하세요: ");
				String bTitle = scn.next();
				System.out.println("게시글 내용을 입력하세요: ");
				String bContent = scn.next();
				System.out.println("게시글 작성자를 입력하세요: ");
				String bWriter = scn.next();
				System.out.println("게시글 작성 시간을 입력하세요: ");
				String bDate = scn.next();

				SamsungLions s1 = new SamsungLions(bNo, bTitle, bContent, bWriter, bDate);
				service.insertSamsung(s1);

			} else if (menu == 2) {
				List<SamsungLions> list = service.samsungList();
				for (SamsungLions s : list) {
					System.out.println(s.toString());
				}

			} else if (menu == 3) { // 한건 조회.
				System.out.println("조회할 게시판 번호를 입력하세요: ");
				int bNo = scn.nextInt();
				SamsungLions samsung = service.getSamsung(bNo);
				if (samsung == null) {
					System.out.println("조회된 결과가 없습니다.");
				} else {
					System.out.println(samsung.toString());
				}

			} else if (menu == 4) {
				System.out.println("수정할 게시판 번호를 입력하세요: ");
				int bNo = scn.nextInt();
				System.out.println("제목 입력: ");
				String bTitle = scn.next();
				System.out.println("내용 입력: ");
				String bContent = scn.next();
				System.out.println("작성자 입력: ");
				String bWriter = scn.next();
				System.out.println("작성시간을 입력하세요: ");
				String bDate = scn.next();

				SamsungLions s1 = new SamsungLions(bNo, bTitle, bContent, bWriter, bDate);
				service.modifySamsung(s1);
				System.out.println("처리가 완료되었습니다.");

			} else if (menu == 5) { // 삭제.
				System.out.println("삭제할 게시판 번호를 입력하세요: ");
				int bNo = scn.nextInt();
				service.removeSamsung(bNo);

			} else if (menu == 6) { // 이름으로 여러건 조회.
				System.out.println("조회할 게시글 작성자를 입력하세요: ");
				String searchName = scn.next();

				List<SamsungLions> list = service.searchSamsung(searchName);
				for (SamsungLions s : list) {
					System.out.println(s.toString());
				}

			} else if (menu == 9) {
				System.out.println("SamsungLions APP를 종료합니다, 감사합니다.");
				service.saveToFile();
				break;
			}

		} // end of while()
		System.out.println("end of SamsungLions App");

	}

}
