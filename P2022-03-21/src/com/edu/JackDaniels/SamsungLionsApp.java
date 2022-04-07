package com.edu.JackDaniels;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class SamsungLionsApp {
	// 필드 ↓
	List<SamsungLions> list = new ArrayList<SamsungLions>();
	Scanner scn = new Scanner(System.in);

//	// 생성자
//	public SamsungLionsApp() {
//
//		list.add(new SamsungLions(101, "제목1", "내용1", "작성자1", "작성시간1"));
//		list.add(new SamsungLions(102, "제목2", "내용2", "작성자2", "작성시간2"));
//		list.add(new SamsungLions(103, "제목3", "내용3", "작성자3", "작성시간3"));
//		list.add(new SamsungLions(104, "제목4", "내용4", "작성자4", "작성시간4"));
//	}
//
//	// 멤버클래스. // 밑처럼 하는 이유는 해당 클래스에서만 사용하고 싶기 때문이다.
//	class SamsungServiceImpl implements SamsungLionsService {
//		@Override
//		public void insertSamsung(SamsungLions samsung) {
//			list.add(samsung); // 추가.
//		}
//
//		@Override
//		public SamsungLions getSamsung(int sno) { // 학생번호로 한건 조회.
//			for (int i = 0; i < list.size(); i++) {
//				if (list.get(i).getBno() == sno) {
//					return list.get(i);
//				}
//			}
//			return null; // 리스트를 리턴하겠습니다.
//		}
//
//		@Override
//		public List<SamsungLions> samsungList() { // 전체 리스트.
//			return list;
//		}
//
//		public void modifyStudent(SamsungLions samsung) { // 수정.
//			for (int i = 0; i < list.size(); i++) {
//				if (list.get(i).getBno() == samsung.getBno()) {
//					list.get(i).setBtitle(samsung.getBtitle()); // 제목수정.
//					list.get(i).setContent(samsung.getContent()); // 내용수정.
//					list.get(i).setWriter(samsung.getWriter()); // 작성자수정.
//					list.get(i).setDate(samsung.getDate()); // 작성일수정.
//				}
//			}
//		}
//
//		@Override
//		public void removeSamsung(int del) { // 한건삭제
//			for (int i = 0; i < list.size(); i++) {
//				if (list.get(i).getBno() == del) {
//					list.remove(i);
//					System.out.println("삭제했습니다.");
//					break;
//				} else {
//					System.out.println("없습니다.");
//				}
//			}
//		}
//
//		@Override
//		public List<SamsungLions> searchSamsung(String name) {
//			List<SamsungLions> searchList = new ArrayList<SamsungLions>();
//			// 찾았다고 종료 X
//			for (int i = 0; i < list.size(); i++) {
//				// 같은 이름이 있는지 찾아보고 있으면 searchList.add()
//				if (list.get(i).getWriter().equals(name)) { // equals 메소드는 비교하고자 하는 대상의 내용 자체를 비교
//					searchList.add(list.get(i));
//				}
//			}
//			return searchList;
//		}
//
//		
//
//		@Override
//		public void modifySamsung(SamsungLions samsung) {
//			// TODO Auto-generated method stub
//
//		}
//
//		@Override
//		public int writeNum() {
//			// TODO Auto-generated method stub
//			return 0;
//		}
//
//		@Override
//		public int loginSamsung(String id, String pw) {
//			return 0;
//			// TODO Auto-generated method stub
//			
//		}
//
//	} // end of StudentServiceImpl

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

		System.out.println(".　　　　　　　　　　 ✦ 　　　　   　 　　　˚　　　　　　　　　　　　　　*　　　　　　   　　　　　　　　　　　　　　　.　　　　　　　　　　　　　　. 　　 　　　　　　　 ✦ 　　　　　　　　　　 　 ‍ ‍ ‍ ‍ 　　　　 　　　　　　　　　　　　,　　   　\r\n"
				+ "\r\n"
				+ ".　　　　　　　　　　　　　.　　　ﾟ　  　　　.　　　　　　　　　　　　　.\r\n"
				+ "\r\n"
				+ "　　　　　　,　　　　　　　.　　　　　　    　　　　 　　　　　　　　　　　　　　　　　　 ☀️ 　　　　　　　　　　　　　　　　　　    　      　　　　　        　　　　*　　　　　　　　　. 　　　　　　　　　　.　　　　　　　　　　　　　. 　　　　　　　　　　　　　　　　       　   　　　　 　　　　　　　　　　　　　　　　       　   　　　　　　　　　　　　　　　　       　    ✦ 　   　　　,　　　　　　　　　*　　    🚀 　　　　 　　,　　　 ‍ ‍ ‍ ‍ 　 　　　　　　　　　　　　.　　　　　 　　 　　　.　　　　　　　　　　　　　 　           　　　　　　　　　　　　　　　　　　　˚　　　 　   　　　　,　　　　　　　　　　　       　    　　　　　　　　　　　　　　　　.　　　  　　    　　　　　 　　　　　.　　　　　　　　　　　　　.　　　　　　　　　　　　　　　* 　　   　　　　　 ✦ 　　　　　　　         　        　　　　 　　 　　　　　　　 　　　　　.　　　　　　　　　　　　　　　　　　.　　　　　    　　. 　 　　　　　.　　　　 🌕 　　　　　   　　　　　.　　　　　　　　　　　.　　　　　　　　　　   　\r\n"
				+ "\r\n"
				+ "　˚　　　　　　　　　　　　　　　　　　　　　ﾟ　　　　　.　　　　　　　　　　　　　　　. 　　 　 🌎 ‍ ‍ ‍ ‍ ‍ ‍ ‍ ‍ ‍ ‍ ,　 　　　　　　　　　　　　　　* .　　　　　 　　　　　　　　　　　　　　.　　　　　　　　　　 ✦ 　　　　   　 　　　˚　　　　　　　　　　　　　　*　　　　　　   　　　　　　　　　　　　　　　.　　　　　　　　　　　　　　.");
		
		while (true) {
			System.out.println("                                                                      　　　　,,　＿\r\n"
					+ "                                                                      　　／ 　　　 ｀､\r\n"
					+ "                                                                      　 /　　　　　● ╮\r\n"
					+ "                                                                      　/ ● 　　 　💧　l\r\n"
					+ "                                                                      　l　💧　し　 💧　|\r\n"
					+ "                                                                      　l　💧　_＿,,ノ 💧l\r\n"
					+ "                                                                      　 ＼💧＿´'￣´_💧/\r\n"
					+ "                                                                      . 　 /💧　　￣ 💧 ╮\r\n"
					+ "                                                                      　 /　💧　　　💧 .╮\r\n"
					+ "                                                                      .　|　　💧　　　　.|");
			System.out.println("                                                            ╔══════════════════════════╗\r\n                                                              [ID : admin] [PW : 1234]                                                            \r\n                                                            ╚══════════════════════════╝");
			System.out.println("                                                            ╔══════════════════════════╗\r\n                                                            1.로그인 2.회원가입(미구현) 3.종료                                                            \r\n                                                            ╚══════════════════════════╝");
			System.out.println("                                                            ╔══════════════════════════╗\r\n                                                                   번호를 입력하세요. >>                                                            \r\n                                                            ╚══════════════════════════╝");
			int menu1=scn.nextInt();			
			if (menu1 == 1) {
				
			System.out.println("                                                ∧__∧");
			System.out.println("                                               (  ･ω･)         · · ─────── ·𖥸· ─────── · ·");
			System.out.println("                                               (っ▄︻▇〓▄︻┻┳═一　　・・・・・ 아이디를 입력해주세요☜");
			System.out.println("                                               /　   )         · · ─────── ·𖥸· ─────── · ·");
			System.out.println("                                               ( /￣∪");
			String id = scn.next();
			
			
			System.out.println("                                                ∧__∧");
			System.out.println("                                               (  ･ω･)         · · ─────── ·𖥸· ─────── · ·");
			System.out.println("                                               (っ▄︻▇〓▄︻┻┳═一　　・・・・・ 비밀번호를 입력해주세요☜");
			System.out.println("                                               /　   )         · · ─────── ·𖥸· ─────── · ·");
			System.out.println("                                               ( /￣∪");
			String pw = scn.next();
			
			int result = service.loginSamsung(id, pw);
			if (result == 1) {
				System.out.println(" \r\n ");
				System.out.println("                                                                 ╔═══════════════════╗\r\n                                                                  ☞로그인이 완료되었습니다☜                                                              \r\n                                                                 ╚═══════════════════╝");
			} else if (result == 0) {
				System.out.println("                                                                 ╔════════════════╗\r\n                                                                   ☞다시 입력하세요☜                                                              \r\n                                                                 ╚════════════════╝");
				continue;
				
			}
            
			
		} else if (menu1 == 2) {
			System.out.println("                                                               ╔═══════════════════╗                                                           \r\n                                                                ☞지원되지 않는 서비스입니다.                                                           \r\n                                                               ╚═══════════════════╝");
			break;
		} else if (menu1 == 3) {
			System.out.println("                                                           ╔═════════════════════════════════════╗                                                                \r\n                                                             ☞SamsungLions APP를 종료합니다, 감사합니다.                                                           \r\n                                                           ╚═════════════════════════════════════╝");
			System.out.println("                                                      ˛*.。˛*˛.*☆҉ *.˛★ ˛*.。˛* ˛. *☆҉ *. ˛*.。˛* ˛. *☆҉\r\n"
					+ "                                                      °*_██_*.。*/.*˛\\ .˛* .˛。.˛.*.★**★ 。* . *☆҉\r\n"
					+ "                                                      ˛. (´• ̮•)*.. .*/♫.♫\\*˛. * ˛_Π_____.♥*.*☆҉ ˛**. ˛*.。˛. *☆҉\r\n"
					+ "                                                      .°( . • .) °../• '♫ ' •\\.˛*./______/~＼*. ˛*.。˛* ˛*.。˛* ˛. *☆҉\r\n"
					+ "                                                      *(...'•'.. ) *˛╬╬╬╬╬˛°.｜田田 ｜門｜╬╬╬╬╬*˚*. ˛*.。˛* ˛. *☆\r\n"
					+ "                                                      ¯˜\"*°••°*\"˜¯`´¯˜\"*°••°*\"˜¯` ´¯˜\"*°´¯˜\"*°••°*\"˜¯`´¯˜\"*°°*\"˜¯`´¯˜\"*°");

			}
		   break;
		}
			while (true) {
			System.out.println("                                                        ∧＿∧  　             —̳͟͞͞⚾️            —̳͟͞͞⚾️\r\n"
					+ "                                                      (·•︠‿•︡ )つ  —̳͟͞͞⚾️          —̳͟͞͞⚾️\r\n"
					+ "                                                      (つ　 <  \r\n"
					+ "                                                      ｜　 _つ                                         \r\n"
					+ "                                                      `し´");
				
			System.out.println("                            ╔══════════════════════════════════════════════════════════════════════════════════════════════╗");
			
			System.out.println("☞                              SamsungLions 게시판에 오신걸 환영합니다☜");
			System.out.println("                               [1.게시글 작성] [2.게시글 목록] [3.게시글 조회, 댓글작성] [4.게시글 수정] [5.게시글 삭제] [6.작성자 조회] [9.종료]");
			System.out.println("                                                                        ☞선택☞☞ ");
			System.out.println("                            ╚══════════════════════════════════════════════════════════════════════════════════════════════╝");
			System.out.println("                            ╔══════════════════════════════════════════════════════════════════════════════════════════════╗");
			System.out.println("                                                                       김상수 응원가       \r\n                                                           2:00 ──────────⊙──── 2:24\r\n"
					+ "                                                            ⇆ㅤㅤㅤ         ◁ㅤㅤ❚❚ㅤㅤ▷ ㅤㅤㅤㅤㅤ↻");
			System.out.println("                            ╚══════════════════════════════════════════════════════════════════════════════════════════════╝");
			Date now = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			int menu = scn.nextInt();
			if (menu == 1) {
				// 메뉴1 : 게시글 번호, 제목, 내용, 작성자, 작성일시
				System.out.println("                                                                ╔════════════════════╗\r\n                                                                 ☞게시글 번호를 입력하세요: \r\n                                                                ╚════════════════════╝");
				int bNo = scn.nextInt();
				System.out.println("                                                                ╔════════════════════╗                                                                \r\n                                                                 ☞게시글 제목을 입력하세요: \r\n                                                                ╚════════════════════╝");
				String bTitle = scn.next();
				System.out.println("                                                                ╔════════════════════╗\r\n                                                                 ☞게시글 내용을 입력하세요:                                                                 \r\n                                                                ╚════════════════════╝");
				String bContent = scn.next();
				System.out.println("                                                                ╔════════════════════╗                                                                \r\n                                                                 ☞게시글 작성자를 입력하세요:                                                                 \r\n                                                                ╚════════════════════╝");
				String bWriter = scn.next();
				String bDate = sdf.format(now);
				SamsungLions s1 = new SamsungLions(bNo, bTitle, bContent, bWriter, bDate);
				service.insertSamsung(s1);

			} else if (menu == 2) {
				List<SamsungLions> list = service.samsungList();
				for (SamsungLions s : list) {
					System.out.println("╔═════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
					System.out.println(s.toString());
					System.out.println("╚═════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
				}

			} else if (menu == 3) { // 한건 조회.
				System.out.println();
				System.out.println("                                                                ╔══════════════════════════╗                                                                \r\n                                                                 ☞조회할 게시판 번호를 입력하세요:                                                                 \r\n                                                                ╚══════════════════════════╝                                                                \r\n");
				int bNo = scn.nextInt();
				SamsungLions samsung = service.getSamsung(bNo);
				if (samsung == null) {
					System.out.println("                                                                ╔══════════════════════════╗\r\n                                                                ☞조회된 결과가 없습니다.                                                                \r\n                                                                ╚══════════════════════════╝");
				} else {
					System.out.println("╔═════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");

					System.out.println(                                       (samsung.toString()));
					System.out.println("╚═════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");

					System.out.println("                                                                ╔══════════════════════════╗\r\n                                                                   ☞1: 댓글작성 ☞2: 나가기\r\n                                                                ╚══════════════════════════╝");
					int dNo = scn.nextInt();
					System.out.println("                                                                ╔══════════════════════════╗\r\n                                                                     ☞댓글 내용을 입력하세요                                                                \r\n                                                                ╚══════════════════════════╝");
					String Replytext = scn.next();
					System.out.println("                                                                ╔══════════════════════════╗\r\n                                                                     ☞댓글 작성자를 입력하세요.\r\n                                                                ╚══════════════════════════╝");
					String Writer = scn.next();
					ReplyServiceOracle kim = new ReplyServiceOracle();

					int rno = service.writeNum();

					rno += 1;
					System.out.println(rno);
					Reply re = new Reply(rno, Replytext, Writer);
					kim.create(re);
					System.out.println("╔═════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
					System.out.println(re.toString());
					System.out.println("╚═════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");


				}

			} else if (menu == 4) {
				System.out.println("                                                                ╔══════════════════════════╗                                                                \r\n                                                                   ☞수정할 게시판 번호를 입력하세요:                                                                 \r\n                                                                ╚══════════════════════════╝");
				int bNo = scn.nextInt();
				System.out.println("                                                                ╔══════════════════════════╗                                                                \r\n                                                                   ☞제목 입력: \r\n                                                                ╚══════════════════════════╝");
				String bTitle = scn.next();
				System.out.println("                                                                ╔══════════════════════════╗\r\n                                                                         ☞내용 입력: \r\n                                                                ╚══════════════════════════╝");
				String bContent = scn.next();
				System.out.println("                                                                ╔══════════════════════════╗                                                                                                                                        \r\n☞작성자 입력:                                                                 \r\n                                                                ╚══════════════════════════╝");
				String bWriter = scn.next();
				System.out.println("                                                                ╔══════════════════════════╗\r\n                                                                     ☞작성시간을 입력하세요: \r\n                                                                ╚══════════════════════════╝");
				String bDate = scn.next();

				SamsungLions s1 = new SamsungLions(bNo, bTitle, bContent, bWriter, bDate);
				service.modifySamsung(s1);
				System.out.println("                                                                ╔══════════════════════════╗\r\n                                                                     ☞처리가 완료되었습니다.                                                                \r\n                                                                ╚══════════════════════════╝");

			} else if (menu == 5) { // 삭제.
				System.out.println("                                                                \r\n                                                                ╔══════════════════════════╗                                                                \r\n                                                                  ☞삭제할 게시판 번호를 입력하세요:                                                                 \r\n                                                                ╚══════════════════════════╝");
				int bNo = scn.nextInt();
				service.removeSamsung(bNo);

			} else if (menu == 6) { // 이름으로 여러건 조회.
				System.out.println("                                                                ╔═══════════════════════════════╗                                                                \r\n                                                                ☞조회할 게시글 작성자를 입력하세요:                                                                 \r\n                                                                ╚═══════════════════════════════╝");
				String searchName = scn.next();

				List<SamsungLions> list = service.searchSamsung(searchName);
				for (SamsungLions s : list) {
					System.out.println("╔═════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
					System.out.println(s.toString());
					System.out.println("╚═════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");

				}

			} else if (menu == 9) {
				System.out.println("                                                                ╔═════════════════════════════════════╗\r\n                                                                  ☞SamsungLions APP를 종료합니다, 감사합니다.                                                                \r\n                                                                       ☞end of SamsungLions App☜                                                                \r\n                                                                ╚═════════════════════════════════════╝");
				System.out.println("                                                      ˛*.。˛*˛.*☆҉ *.˛★ ˛*.。˛* ˛. *☆҉ *. ˛*.。˛* ˛. *☆҉\r\n"
						+ "                                                      °*_██_*.。*/.*˛\\ .˛* .˛。.˛.*.★**★ 。* . *☆҉\r\n"
						+ "                                                      ˛. (´• ̮•)*.. .*/♫.♫\\*˛. * ˛_Π_____.♥*.*☆҉ ˛**. ˛*.。˛. *☆҉\r\n"
						+ "                                                      .°( . • .) °../• '♫ ' •\\.˛*./______/~＼*. ˛*.。˛* ˛*.。˛* ˛. *☆҉\r\n"
						+ "                                                      *(...'•'.. ) *˛╬╬╬╬╬˛°.｜田田 ｜門｜╬╬╬╬╬*˚*. ˛*.。˛* ˛. *☆\r\n"
						+ "                                                      ¯˜\"*°••°*\"˜¯`´¯˜\"*°••°*\"˜¯` ´¯˜\"*°´¯˜\"*°••°*\"˜¯`´¯˜\"*°°*\"˜¯`´¯˜\"*°");
				break;
				}
				
			}

		} // end of while()
		

		
	
	}
  

